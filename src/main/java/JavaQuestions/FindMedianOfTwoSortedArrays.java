package JavaQuestions;

public class FindMedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int [] nums1= {1,2,4,5};
        int [] nums2 = {3};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }



    public static  double findMedianSortedArrays(int [] nums1, int [] nums2) {
        int [] mergedArray = merge(nums1, nums2);
        if(mergedArray.length %2 == 1){
            return mergedArray[mergedArray.length /2];
        }
        return ((double)mergedArray[mergedArray.length /2] +
                (double)mergedArray[(mergedArray.length /2) -1]) /2;

    }



   private static int [] merge(int [] nums1, int [] nums2){

        int [] mergedArray = new int[nums1.length + nums2.length];
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

        return mergedArray;
        }
    }

