package day4_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        int[] arr= {3,1,5,2,5,1,2,5};
        System.out.println(" ---------------stream source------------------");
        Arrays.stream(arr);// we created stream , from arr

        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,5,2,4,1,2,6,5,8,10,5,6,7,12));
        System.out.println(list.stream());// we created a stream form list. Only printing so far
        System.out.println("----------------- Intermediate Operations------------");

        System.out.println("----------------- distinct()------------");

       // when we make stream from the source, will not affect original source

        // .forEach()-> using consumer -> print all ->collector
         System.out.println(list.stream().distinct());// this still returns a stream , so we can't see anything by
         // printing it like this. We need a terminal operation

        list.stream().distinct().forEach(n-> System.out.println(n)); //.forEach(n-> System.out.println(n)); lambda but we can use method reference
        list.stream().distinct().forEach(System.out::println);// method reference

        System.out.println("----filter()- based on condition and predicate function interface -----------");
        //passing one parameter returning boolean

        list.stream().
                filter(p-> p % 2 ==0).collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println(" filter(filter based on functional interface ) with distinct(removes dup)");
        list.stream()
                .distinct()
                .filter(p-> p % 2 ==1).collect(Collectors.toList())
                .forEach(System.out::println);

        //if the people don't know how to know tho use streams that will be negative

        System.out.println("----------------- Limit()------------");
        list.stream()
                .limit(5)

                .forEach(System.out::println);

        System.out.println("----------------- Limit()- get the first 6 numbers that are less than 4-----------");
        list.stream()
                .filter(p->p < 4)
                .limit(6)
                .forEach(System.out::println);


        System.out.println("----------------- skip()------------");
        list.stream()
                .skip(5) // keep
                .forEach(System.out::println);

        System.out.println("----------------- skip(), limit()------------");
        list.stream()
                .skip(4)// skip 4
                .limit(3)// keep first 3
                .forEach(System.out::println);

        System.out.println("----------------- map()------------");
        list.stream()
                .map(n->n * 2)//
                .forEach(System.out::println);

        System.out.println("----------------- map() is function method of stream------------");
        list.stream()
                .limit(6)
                .map(n -> n * n ) // multiply with same number
                .forEach(System.out::println);


        System.out.println("-----------------  sort() 2 parameter------------");
        list.stream()
                .sorted()
                .forEach(System.out::println);


        System.out.println("-----------------  sort() reverse order ------------");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        }


    }

