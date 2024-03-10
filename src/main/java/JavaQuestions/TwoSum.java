package JavaQuestions;


import JavaQuestions.book.TwoSumProblem;

import java.util.Arrays;
import java.util.HashMap;



public class TwoSum {
    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};
        int target = 8;
        // int [] result = twoSum(nums, target);
     //  System.out.println(result[0]+ ", " +result[1]);
        TwoSum solver = new TwoSum();
        int result []= solver.twoSum(nums, target);
        System.out.println(Arrays.toString(result));



    }

    public  int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
