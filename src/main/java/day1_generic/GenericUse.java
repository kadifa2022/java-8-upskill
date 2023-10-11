package day1_generic;

import java.util.ArrayList;
import java.util.List;

public class GenericUse {
    public static void main(String[] args) {

        List things = new ArrayList();// not safe to put different data => generics is protecting us

        things.add("java");
        things.add(null);
        things.add(3);
        things.add(3.14);

       // things.get(0).substring(0,3); => Object type do not have access to substring

 // as a user we want to define type
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);






    }
}
