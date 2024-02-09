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
       // one parameter -  no need parenthesis  -> no need return // parenthesis
        // lambda is implementing test() -> lambda is functional interface
    /*
    - Predicate<T>
        defines a function with one parameter and returns boolean

        boolean test(T t)
			-> p is a common name for the argument name in the lambda

		ex:
            removeIf method when we used the lambda to remove the elements
            the parameter of the removeIf method was a Predicate functional interface

     */

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

        System.out.println("Consumer--------------accept()-----forEach()--------------");
        // defines a parameter and does not return anything -> method (void accept() )
        // print the first char of a String
    /*
    - Consumer<T>
        defines a function with one parameter and does not return anything
         void accept(T t)
         ex:
	        forEach method from Iterable takes the Consumer argument
 */

        Consumer<String> firstChar = p -> System.out.println(p.charAt(0));
        firstChar.accept("Hello"); // returning nothing no print

        List<String> names = new ArrayList<>(Arrays.asList("Kelly", "James", "Houng", "Oleg", "Salma"));
        // default forEach  method
          names.forEach(s-> System.out.println(s + " "));
          names.forEach(s-> System.out.println(s.charAt(0) + " " + s.charAt(s.length() -1)));


        System.out.println("BiConsumer--------- forEach loop contains()-----------");
        // has 2 parameters(maps -> we need to define two parameters ) and don't return anything
/*
- BiConsumer<T, U>
        defines a function with two parameters and does not return anything
  void accept(T t, U u)
        ex:
            forEach(BiConsumer)
                map has this method to allow iteration of the map

 */

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
   /*
    - Function<T, R>
        defines a function with one parameter and a return type (any object)

        R apply(T t);

    */
        Function<String, Integer> countVowels= str-> {// when we use curly brackets we have to use return type
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


        System.out.println("Supplier ---get()---now()---- DateTimeFormatter.ofPattern() added with Java 8-----");


      /*  - Supplier<T>
                defines a function with no parameter and a return type (any object)

        T get(); => abstract method

       */
                          //()-> no parameter and return local date
        Supplier<String> getDay = ()-> LocalDate.now().getDayOfWeek().name();
        System.out.println(getDay.get());
//Local date time added with Java 8, before was calendar
        Supplier<String> getDateTime = ()-> LocalDateTime.now().format(DateTimeFormatter.ofPattern("M/d/y h:m a"));
        System.out.println(getDateTime.get());

        Supplier<Integer> getRandomNumber = ()-> new Random().nextInt(1001);
        System.out.println(getRandomNumber.get());

    }

}
