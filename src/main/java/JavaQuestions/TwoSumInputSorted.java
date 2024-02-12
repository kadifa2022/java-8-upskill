package JavaQuestions;

public class TwoSumInputSorted {
    public static void main(String[] args) {
    int [] numbers = {2,7,11,15};
        int target = 17;
        int [] answer = new int [2];
        answer = twoSum(numbers,target);
        if(answer !=null)
            for (int i = 0; i < 2; i++) {
                System.out.println(answer[i] + "");

            }




    }
    // another solution
    public static  int [] twoSum(int[]numbers , int target){
        int left =0, right = numbers.length-1;

        while(numbers[left] + numbers[right] !=target){
            if (numbers[left] + numbers[right] > target)
                right--;
            else
                left ++;
            if(right == left) return new int[]{};
        }
        return new int[] {left +1, right +1};
    }
//
//    public static int [] twoSum(int[] nums, int target){
//        int start = 0, end = nums.length-1;
//
//        while(start< end){
//            if(nums[start] + nums[end]==target)
//                return new int[]{start +1, end +1};
//            if(nums[start] + nums[end]>target){
//                end--;
//            }else if(nums[start] + nums[end]<target){
//                start++;
//            }
//        }
//        return null;
//    }

}
