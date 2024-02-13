package JavaQuestions;

public class SingleNumber136 {
    public static void main(String[] args) {
        SingleNumber136 solution = new SingleNumber136();
        int [] nums = {2,2,3,2,1,};
        System.out.println(solution.singleNumber(nums));



    }
    public int singleNumber(int[] nums){
        int result =0;
        for(int num :nums){
            result ^=num; // ^= this operation effectively cancels out duplicate numbers,
            // leaving only single number that appears once
        }
        return result;

    }
}
