package day3_doubleColon_and_coparator;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExamples {

    public static void main(String[] args) {



        System.out.println("=====Consumer----- accept()=========");

        Consumer<Integer> print = n-> System.out.println(n);// warning but looking for method reference
        print.accept(10);

        Consumer<Integer> print2 =  System.out::println;// same functionality as line 17 lambda -> if
        print2.accept(5);


        System.out.println("=====Function ----------apply()====================");

        Function<String, String> toLower =s->s.toLowerCase();
        System.out.println(toLower.apply("Java"));

        Function<String, String> toLower2 = String::toLowerCase;
        System.out.println(toLower2.apply("Java"));// same as line 26 lambda


        System.out.println("====Supplier  ----------random() num and get()====================");// no parameter just returning Type

        Supplier<Double> randomNum = ()-> Math.random();
        System.out.println(randomNum.get());

        Supplier<Double> randomNum2 = Math::random; // same as line 35 lambda
        System.out.println(randomNum2.get());

        System.out.println("========BiFunction  ---------apply()================");


        BiFunction<String, Integer, String> sub = (str, i)->str.substring(i);
        System.out.println(sub.apply("Friday", 3));

        BiFunction<String, Integer, String> sub2 = String::substring;// same as line 46 lambda
        System.out.println(sub2.apply("Happy", 4));








    }


}
