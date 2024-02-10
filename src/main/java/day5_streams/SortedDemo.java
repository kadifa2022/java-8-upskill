package day5_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {


    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<>();
        arrList.add(15);
        arrList.add(250);
        arrList.add(52);

        //get stream object
        Stream<Integer> openStream = arrList.stream();
        //Configure stream by filtering uot required values
        Stream <Integer> filteredStream = openStream.filter(i-> i>=20);
        // you  can sort any stream filter or mapped or normal stream (non filter or non mapped too)
        Stream<Integer> sortedStream =filteredStream.sorted();
        sortedStream.forEach(x-> System.out.println(x));

        System.out.println("Now in single line");

        Stream<Integer> newFilteredSortedList= arrList.stream().filter(i->i >= 20).sorted();
        //forEach method takes lambda expression as a argument and
        // apply that lambda to each element present in that stream
        newFilteredSortedList.forEach(x-> System.out.println(x));
    }
}