package JavaQuestions.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(120);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

       Integer secondHighest = findSecondHighest(numbers);
       if(secondHighest != null){
           System.out.println("Second highest element: " + secondHighest);
       }else {
           System.out.println("N no second highest element found");
       }
    }

    public static Integer findSecondHighest(List<Integer> numbers){
        if(numbers == null || numbers.size() < 2){
            return null; // Not enough elements to find the highest
        }
        Collections.sort(numbers, Collections.reverseOrder()); // sort in descending order
        return numbers.get(1); // Index 1 holds the second-highest element
    }

}
