package day5_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        int [][] nums =  {// multidimensional array

            {1, 2, 3,},
            {4, 5, 6,},
            {7, 8, 9, 10
            }
        };

        Stream<int []> a= Arrays.stream(nums);

        int [] combined = Arrays.stream(nums)
                .flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println(Arrays.toString(combined));



        List<List<String>> namesList = Arrays.asList(
                Arrays.asList("James", "Anna"),
                Arrays.asList("JEmre", "Kelly"),
                Arrays.asList("Ed", "Aly"),
                Arrays.asList("Josip", "Ajla"),
                Arrays.asList("Jack", "Annabela")
        );
        List<String> allNames = namesList.stream()
                .flatMap(List::stream)
                .map(str->str + str.length())
                .collect(Collectors.toList());
        System.out.println(allNames);

        }
        }



