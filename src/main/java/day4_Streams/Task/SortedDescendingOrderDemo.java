package day4_Streams.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDescendingOrderDemo {
    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<>();
        arrList.add(15);
        arrList.add(250);
        arrList.add(52);


        //get Stream object
        Stream<Integer> openStream  = arrList.stream();
        //Configure stream by filtering out required values
        Stream<Integer> filteredStream = openStream.filter(i->i >= 20);
        //You can sort on any stream filter or mapped or on normal stream(non filter or non mapped to
        Stream<Integer> sortedStream =filteredStream.sorted((i1, i2)-> i2.compareTo(i1));
        sortedStream.forEach(x-> System.out.println(x));

        System.out.println("Now in single line");

       Stream<Integer> newFilteredSortedList= arrList.stream().filter(i -> i >= 20).sorted((i1,i2)->i2.compareTo(i1));
        newFilteredSortedList.forEach(x-> System.out.println(x));
    }
}