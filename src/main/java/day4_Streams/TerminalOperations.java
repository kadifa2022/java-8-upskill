package day4_Streams;

import java.util.Arrays;

public class TerminalOperations {

    public static void main(String[] args) {

        String [] names = {"Val", "Betul", "Ercan", "Nihan", "Huong"};
        Arrays.stream(names)
                .filter(p->p.contains("a"))
                .forEach(System.out::println);

        System.out.println(Arrays.stream(names)
                .filter(p->p.contains("a"))
                .count()); //count returns al long for the numbers of elements - it stops the stream


        // Given a String count the number of unique character in the String
        System.out.println("   ----------Mini task of unique characters    -----------");

        String str = " aaaaaaabbbbbbbbcccdddddeeeeffffffaaaaabbbbbbbbccddddd";

        System.out.println(str.chars()
                .distinct()
                .count());

        str.chars() // int streams
                .mapToObj(a->(char) a)// stream  character
                .distinct()
                .forEach(System.out::println);

        System.out.println("\t\t\t allMatch() ... predicate return type boolean");

        int[] nums = {4,5,15,20,19,7};
        System.out.println(Arrays.stream(nums)
                .allMatch(p->p<30));

        System.out.println("\t\t anyMatch()Terminal operations-> return boolean");
        System.out.println(Arrays.stream(nums)
                .anyMatch( p -> p % 5 ==0));
        System.out.println(Arrays.stream(nums)
                .anyMatch( p -> p % 50 ==0));

        System.out.println("\t\t noneMatch() Terminal operations-> return boolean ");
        System.out.println(Arrays.stream(nums)
                .noneMatch( p -> p % 5 ==0));// none of them evenly % with 50




    }
}
