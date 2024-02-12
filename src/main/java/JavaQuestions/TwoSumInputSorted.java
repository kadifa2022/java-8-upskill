package JavaQuestions;

public class TwoSumInputSorted {
    public static void main(String[] args) {
    //int [] nums = {2,7,11,15};
//        int target = 13;





    }

    public static int [] twoSum(int[] nums, int target){
        int start = 0, end = nums.length-1;

        while(start< end){
            if(nums[start] + nums[end]==target)
                return new int[]{start +1, end +1};
            if(nums[start] + nums[end]>target){
                end--;
            }else if(nums[start] + nums[end]<target){
                start++;
            }
        }
        return null;
    }

}
