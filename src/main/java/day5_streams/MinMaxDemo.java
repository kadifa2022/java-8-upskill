package day5_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxDemo {
    public static void main(String[] args) {


        List<Integer> arrList = new ArrayList<>();
        arrList.add(20);
        arrList.add(30);
        arrList.add(250);
        arrList.add(32);
        //get stream object
        Stream<Integer> openStream = arrList.stream();
        //configure stream by filtering out required values
        Stream<Integer> filteredStream = openStream.filter(i -> i >= 30);
        // you can sort on any stream filter or mapped or on normal stream (non filter or non mapped too)
//        Integer min = filteredStream.min((i1, i2) -> i1.compareTo(i2)).get();
//        System.out.println(min);

        Integer max = filteredStream.max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(max);

        System.out.println("Now in single line");

       Integer minValue = arrList.stream().min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println(minValue);
        Integer maxValue = arrList.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(maxValue);
    }


}
