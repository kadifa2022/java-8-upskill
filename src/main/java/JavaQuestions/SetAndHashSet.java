package JavaQuestions;

import java.util.*;

public class SetAndHashSet {

    public static void main(String[] args) {
    //Set is one way that you can group objects together and handle them as one unit
    // Why hashSet? It is using hashTable storage mechanism behind the scene. HashSet is the fastest
    // add, removes, looked up is constant time, does not matter how many elements is inside set
   // Tree set is printing in natural order ascending and is slowest, behind the scene is using a tree instead of hashSet,
    //LinkedHashSet maintains insertion order almost fast as hashSet

    Set<String> names = new HashSet<>();
   names.add("John");
   names.add("Lisa");
   names.add("Mike");
   names.add("Walter");
  // names.add("Walter");// don't allows duplicates
       // names.remove("Walter");// don't take index for remove
       // System.out.println(names.size()); // is not printing in insertion order

       // System.out.println(names.contains("Joe"));
//
//        for(String name: names ){
//            System.out.println(name);
//        }
        names.forEach(System.out::println);
       Iterator<String> namesIterator = names.iterator();
       while(namesIterator.hasNext()){
           System.out.println(namesIterator.next());
       }

       // if we have duplicates just use set to remove dup
       List<Integer> numberList = new ArrayList<>();
       numberList.add(1);
       numberList.add(1);
       numberList.add(3);
       numberList.add(2);
       numberList.add(13);
       numberList.add(12);
       numberList.add(12);
       System.out.println(numberList);

       Set<Integer> numberSet = new HashSet<>(numberList);// take any collection to another collection
      // numberSet.addAll(numberList);// another way by using addAll
        System.out.println(numberSet);


    }
}
