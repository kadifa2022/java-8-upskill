package JavaQuestions.palindrome;

import JavaQuestions.MedianOfTwoSortedArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianOfSortedArrays2Test {

    @Test
    public void testFindMedianSortedArrays(){
        //Test case: odd total length
        int [] nums1 = {1,3};
        int [] nums2 ={2};
        assertEquals(2.0, MedianOfTwoSortedArrays.findMedianSortedArrays(nums1,nums2));

        //Test case: even  total length
        int [] nums3 = {1,2};
        int [] nums4 ={3,4};
        assertEquals(2.5, MedianOfTwoSortedArrays.findMedianSortedArrays(nums3,nums4));


    }


}