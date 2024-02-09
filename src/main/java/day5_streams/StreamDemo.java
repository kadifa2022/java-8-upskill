package day5_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {



    /*
    What are streams?
    If we want to process bulk objets of collection then go for stream concept.
    Why to operate on collection in Java 8 is Stream.
    It is a special iterator class that allows processing collections of objects in a functional manner.
    Eg: fetch all objects from collection of list whose value is grater than 15
     */


        List<Integer> arList = new ArrayList<>();
        arList.add(15);
        arList.add(25);
        arList.add(5);

        List<Integer> newAl = new ArrayList<>();
        newAl=arList.stream().filter(x -> x >= 15).collect(Collectors.toList());
        newAl.stream().forEach(x -> System.out.println(x));







 /*
        // Without stream:
        List<Integer> arListFromMethod= findElements(arList);
        for(Integer i: arListFromMethod ){
            System.out.println(i);
        }
    }

    private static List<Integer> findElements(List<Integer> arList) {
        List<Integer> newAl = new ArrayList<Integer>();
        for (Integer i:arList) {
            if(i >= 15){
                newAl.add(i);
            }
        }
        return newAl;
    }

  */
    }
}