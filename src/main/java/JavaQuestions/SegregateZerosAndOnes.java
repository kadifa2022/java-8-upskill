package JavaQuestions;

import java.util.Arrays;

public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int [] nums ={0,1,0,1,0,1,1,0,0,1};
        segregateZerosAndOnce(nums);
        System.out.println("Segregated Array: " + Arrays.toString(nums));


        int [] segregatedArray = Arrays.stream(nums)
                .boxed() //convert int to integer
                .sorted((a,b) -> a-b) //sorted array
                .mapToInt(Integer::intValue)  //Convert integer back to int
                .toArray(); // convert stream to array
        System.out.println("Segregated Array" + Arrays.toString(segregatedArray));

    }


    public static void segregateZerosAndOnce(int [] nums){
        int left =0, right = nums.length-1;

        while(left<right){
            //Move pointer until it encounters a 1
            while(left < right && nums[left] ==0){
                left++;
            }
            //Move right pointer until it encounters a 0
            while(left<right && nums[right] ==1){
                right--;

            }
            // Swap elements at left and right pointers
            if(left<right){
                nums[left] =0;
                nums[right] =1;
                left++;
                right--;
            }
        }
    }



}
