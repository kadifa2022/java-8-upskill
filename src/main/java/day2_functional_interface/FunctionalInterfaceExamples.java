package day2_functional_interface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

public class FunctionalInterfaceExamples {
    public static void main(String[] args) {
        System.out.println("Predicate_________test() removeIf()____________");

      //  Predicate<Integer> lessThan10= (int n) -> {return  n<10;};// always know type
       // one parameter -  no need pretence  -> no need return // pretences
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

        System.out.println("Consumer--------------accept()-------------------");
        // defines a parameter and does not return anything -> method (void accept() )
        // print the first char of a String

        Consumer<String> firstChar = p -> System.out.println(p.charAt(0));
        firstChar.accept("Hello");

        List<String> names = new ArrayList<>(Arrays.asList("Kelly", "James", "Houng", "Oleg", "Salma"));
        // default forEach  method
          names.forEach(s-> System.out.println(s + " "));
          names.forEach(s-> System.out.println(s.charAt(0) + " " + s.charAt(s.length() -1)));

        System.out.println("BiConsumer--------- forEach() contains()-----------");
        // has 2 parameters(maps -> we need to define two parameters ) and don't return anything

        BiConsumer<Integer, Integer> sum = (n1, n2) -> System.out.println((n1 + n2));
        sum.accept(5,2);

        BiConsumer<List<String>, Integer> subName = (namesList, end) ->{
            for (String each: namesList) {
                System.out.println(each.substring(0, end));

            }
        };

        subName.accept(names, 3);

        Map<String, String> holidays = new HashMap<>();
        holidays.put("July", "4th of July");
        holidays.put("October", "Halloween");
        holidays.put("December", "Christmas");
        holidays.forEach((k,v)-> System.out.println(k+ " " + v));// for each method by using BiConsumer


        System.out.println("Function---------------------apply()----------------");
        // parameter is String and return type Integer
        Function<String, Integer> countVowels= str-> {// when we use curly bracets we have to use return typer
            String vowels = " aeoiu";
            int numOfVowels = 0;
            for(char each: str.toCharArray()){
                if(vowels.contains(each + "")){
                    numOfVowels++;
                }
            }


            return numOfVowels;
        };
        System.out.println(countVowels.apply("Mississippi"));
        System.out.println(countVowels.apply("Wooden spoon"));
        // convert int [] to a list -> not easy to do  because, of primitive types

        Function<int [], List<Integer>> convertToList= arr-> {
            List<Integer> list = new ArrayList<>();
            for(int each : arr){
                list.add(each);
            }
            return list;
        };
        int [] a = {4,2,4,1,51,2};
        List<Integer> aList = convertToList.apply(a);
        System.out.println(aList);


        System.out.println("Supplier ------now()---- DateTimeFormatter.ofPattern() added with Java 8-----");
        //()-> no parameter
        Supplier<String> getDay = ()-> LocalDate.now().getDayOfWeek().name();
        System.out.println(getDay.get());

        Supplier<String> getDateTime = ()-> LocalDateTime.now().format(DateTimeFormatter.ofPattern("M/d/y h:m a"));
        System.out.println(getDateTime.get());

        Supplier<Integer> getRandomNumber = ()-> new Random().nextInt(1001);
        System.out.println(getRandomNumber.get());

    }

}
