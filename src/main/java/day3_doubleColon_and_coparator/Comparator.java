package day3_doubleColon_and_coparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 2, 1, 6, 21, 5, 2, 10, 14));
      nums.forEach(System.out::println);

        System.out.println("Sort in Ascending  order ------------");

        Collections.sort(nums);
        nums.forEach(System.out::println);

        System.out.println("Sort in Descending   order ------------");
        Collections.sort(nums, (n1, n2) -> n1 > n2 ? -1 : n1 < n2 ? 1: 0);// logic behind compare()
        nums.forEach(System.out::println);

        System.out.println("------------Sort in Ascending    order ------------");
        Collections.shuffle(nums);

        Collections.sort(nums, (n1, n2) -> n1.compareTo(n2));// logic behind compareTo()
        nums.forEach(System.out::println);

        System.out.println("------------Sort in Descending   order ------------");
        Collections.shuffle(nums);

        Collections.sort(nums, (n2, n1) -> n1.compareTo(n2));// logic behind compareTo()
        nums.forEach(System.out::println);

        System.out.println("------------best way to do it  descending  ------------");
        Collections.shuffle(nums);
       // nums.sort(Comparator.reverseOrder());
        nums.forEach(System.out::println);



    }

}
