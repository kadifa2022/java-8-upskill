package JavaQuestions.book;

import java.util.Arrays;
import java.util.List;

public class DoubleEvenNumber {
    public static void main(String[] args) {

        List<Integer> allNumbers = Arrays.asList(1,2,3,4,5,6);

        allNumbers.stream().filter(p->p % 2 == 0).map(n -> n * 2).forEach(System.out::println);
    }
}
