package day6_Optional_BigDecimal;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStreams {

    public static void main(String[] args) {

        System.out.println("====Creating IntStream========");
        IntStream nums1 = IntStream.range(0, 11); // specific stream for number types
        nums1.forEach(System.out::println);

        IntStream nums2 = IntStream.of(5, 10, 15, 20);
        nums2.forEach(System.out::println);

        System.out.println("Creating IntStream() for intermediate operations=========");
        List<String> words = List.of("Java", "Friday", "computer");
        List<Integer> numbers = List.of(3, 4, 15, 12, 5, 2);


        System.out.println("get a list of the length of the words ====");

        List<Integer> wordLength = words.stream()
                .mapToInt(String::length) // give directly int stream back with additional methods that can achieve optional
                .boxed()
                .collect(Collectors.toList());
        System.out.println(wordLength);


        System.out.println("====================multiply all the number by 2====");

        List<Integer> multiOf2 = numbers.stream()
                .mapToInt(n -> n * 2) // give directly int stream back with additional methods that can achieve optional
                .boxed()
                .collect(Collectors.toList());
        System.out.println(multiOf2);

        System.out.println("==============square each number  and get the double back==========");

        List<Double> squared = numbers.stream()
                .mapToDouble(n -> n * 2)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(squared);

        System.out.println("=======convert string to a IntStream()========");

        String str = "Friday";
        IntStream eachChar = str.chars();
        eachChar.forEach(System.out::println);

        str.chars()
                .mapToObj(c -> (char) c)
                .forEach(System.out::println);






    }


}

























