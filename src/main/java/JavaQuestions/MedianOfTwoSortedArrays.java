package JavaQuestions;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[]nums1 = {1,3,4,5,6};
        int[] nums2 = {2,7};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int [] nums1, int [] nums2){
        int totalLength = nums1.length + nums2.length;
        int [] mergedArray = new int[totalLength];
        int i = 0, j= 0, k = 0;

        // Merge the sorted arrays into a single array

        while (i<nums1.length && j< nums2.length){
            if(nums1[i]<nums2[j]){
                mergedArray[k++] = nums1[i++];
            }else{
                mergedArray[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }
        while (j< nums2.length){
            mergedArray[k++] = nums2 [j++];
        }
        //Determine the median based on the length of the merge array
        if(totalLength %2 ==0){
        //If total length is even, return the average of the two middle elements
            int mid1= mergedArray[totalLength / 2-1];
            int mid2= mergedArray[totalLength  / 2];
            return (double) (mid1+mid2) /2;
        }else{
        //if total length is odd, return the middle element
            return mergedArray[totalLength/2];
        }
    }

}
