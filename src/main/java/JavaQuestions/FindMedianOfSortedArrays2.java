package JavaQuestions;

public class FindMedianOfSortedArrays2 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,4,5};
        int[] nums2 = {3};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

   public static double findMedianSortedArrays(int [] nums1, int [] nums2){

       int totalLength = nums1.length + nums2.length;
       int midIndex = totalLength /2;

       //Initialize pointers for both arrays
        int i =0, j=0;
        int prev =0, curr =0;

        //Traverse the combined arrays until reached the median
       while(i+j <= midIndex){
           prev = curr;
       if(i< nums1.length &&(j>=nums2.length || nums1[i]<=nums2[j])){
           curr=nums1[i++];
       }else{
           curr=nums2[j++];
       }
       }
       //if total length is even, return the average of middle two elements
       if(totalLength % 2 ==0){
           return(double) (prev + curr) /2;
       }else{
           return curr;
       }
   }

}
