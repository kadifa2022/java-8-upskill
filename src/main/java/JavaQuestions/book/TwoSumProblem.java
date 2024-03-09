package JavaQuestions.book;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
        int nums[] ={3,2,4};
        int target = 6;
        TwoSumProblem solver = new TwoSumProblem();
        int result []= solver.twoSum(nums, target);
        System.out.println(Arrays.toString(result));


    }

    public int[] twoSum(int [] nums, int target){
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
            int n = nums.length;
            for(int i= 0; i < n; i++){
                int compliment = target -nums[i];
                if (numMap.containsKey(compliment)){
                    return new int[] {numMap.get(compliment), i};
                }
                numMap.put(nums[i], i);
        }
            return  new int[] {};
    }


}
