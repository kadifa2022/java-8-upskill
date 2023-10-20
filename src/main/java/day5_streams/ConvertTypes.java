package day5_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertTypes {
    public static void main(String[] args) {
        // convert from int[] to List<Integer>
        int[] nums = {3,2,4,5,6,1,2,4};
        //boxed() converts the IntStream primitive  to a Stream<Integer> list of non-primitive
        List<Integer> list =Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        // convert List<Integer> to int[]

        List<Integer> listNums = List.of(3,4,32,5,1,23,123,3);// listOf java9
        int[] arr2 = listNums.stream().mapToInt(n->n).toArray();
        System.out.println(Arrays.toString(arr2));

    }
}
