package day5_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {
    // Process elements using toArray()?
    //We can use this method to copy elements present in the stream to specific array


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(25);
        arrayList.add(35);
        arrayList.add(225);


        //get the stream object
        Stream<Integer> openStream = arrayList.stream();
        Stream<Integer> filteredStream = openStream.filter(i -> i >= 20);
        Object[] intArray = filteredStream.toArray();//does not take any arguments, just converts whatever you have in stream object and return object []
        for (Object obj : intArray) {
            System.out.println("Element in array  is " + obj);
        }
        System.out.println("Now in single line ");

        Object [] intArrayOneLine = arrayList.stream().filter(i->i >= 20).toArray();
        for (Object o: intArrayOneLine) {
            System.out.println("Element in array is " + o);

        }




    }
}
