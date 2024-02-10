package day5_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountDemo { // count method

    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<>();
        arrList.add(15);
        arrList.add(25);
        arrList.add(52);

        // get stream object
        Stream<Integer> openStream = arrList.stream();
        //Configure stream by filtering out required values
        Stream<Integer> filteredStream = openStream.filter(i->i >=20);
        long streamCount = filteredStream.count();
        System.out.println(streamCount);

        System.out.println("Now in single line");
        long newFilteredListCount= arrList.stream().filter(i->i >= 20).count();
        System.out.println(newFilteredListCount);
    }
}