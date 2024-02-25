package JavaQuestions;

public class TwoPointerExample {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7,11,13,14};
        int target = 9;
        int [] result = findTwoNumbers(nums, target);
        if (result.length ==2){
            System.out.println("Two numbers found: " + result[0] + "," + result[1]);

        }else{
            System.out.println("No pair of numbers found.");
        }
    }

    public static int[] findTwoNumbers(int[] nums, int target){
        int left = 0; // pointer at the start of the array
        int right = nums.length -1;// pointer at the end of array

        while (left <right){
            int sum = nums[left] + nums[right]; // sum(1+14 =15)

            if(sum == target){ // if the 3+6 =9
                //return the two numbers that add up to the target
                return new int[]{nums[left], nums[right]};
            } else if (sum<target){
                left++;// move the pointer to increase the sum
            }else{
                right--;// move the pointer to decrease the sum

            }
        }
        // if no such pair found, return an empty array
        return new int[0];

    }

}
