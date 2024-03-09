package JavaQuestions.book;

import java.util.Arrays;
import java.util.List;

public class VowelsFinder {
    public static void main(String[] args) {
        String inputString = "Hello, Java 8 Vowels example";

        //Convert the input string to lowerCase for case-insensitive matching
        String lowerCaseString = inputString.toLowerCase();

        //Use Java 8 stream to filter vowels from string
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        long vowelCount = lowerCaseString.chars()
                .mapToObj(c-> (char) c)
                .filter(vowels::contains)
                .count();

        //Display the original String and the count vowels
        System.out.println("Original String " + inputString);
        System.out.println("Number of vowels " + vowelCount);

    }
}
