package day2_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceExamples {
    public static void main(String[] args) {
        System.out.println("Predicate_____________________");

      //  Predicate<Integer> lessThan10= (int n) -> {return  n<10;};// always know type
       // one parameter-  no need pretence  -> no need return // pretences
        // lambda implementing test() -> lambda is functional interface

        Predicate< Integer>  lessThan10 = n -> n < 10;
        System.out.println(lessThan10.test(5));// lambda is impl. test()

        List<Integer> nums = new ArrayList<>(Arrays.asList(23,5,5,2,2,22,16,6));
        //remove all the add numbers
        nums.removeIf(n->n%2==1);
        System.out.println(nums);

        // palindrome
        Predicate<String > isPalindrome = s->new StringBuilder(s).reverse().toString().equals(s);
        System.out.println(isPalindrome.test("racecar"));
        System.out.println(isPalindrome.test("Hello"));

        System.out.println("Consumer---------------------------------");
        // defines a parameter and does not return anything -> method (void accept() )
        // print the first char of a String

        Consumer<String> firstChar = p -> System.out.println(p.charAt(0));
        firstChar.accept("Hello");

        List<String> names = new ArrayList<>(Arrays.asList("Kelly", "James", "Houng", "Oleg", "Salma"));
        // default forEach  method
          names.forEach(s-> System.out.println(s + " "));
          names.forEach(s-> System.out.println(s.charAt(0) + " " + s.charAt(s.length() -1)));

        System.out.println("BiConsumer--------------------");
        // has 2 parameters(maps -> we need to define two parameters ) and don't return anything

        BiConsumer<Integer, Integer> sum = (n1, n2) -> System.out.println((n1 + n2));
        sum.accept(5,2);

        BiConsumer<List<String>, Integer> subName = (namesList, end) ->{
            for (String each: namesList) {
                System.out.println(each.substring(0, end));

            }
        };

        subName.accept(names, 3);




    }

}
