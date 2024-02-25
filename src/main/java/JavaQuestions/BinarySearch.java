package JavaQuestions;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {1,3,5,7,9,11,13,15,19,24,25};
        int target= 7;

        int index = binarySearch(arr, target);
        if(index !=-1){
            System.out.println(" Element Found at index " + index);
        }else{
            System.out.println("Element not found in array.");
        }
    }

    public static int binarySearch(int [] arr, int target){
        int low = 0;
        int high = arr.length -1;

        while(low <=high){
            int mid = low +(high -low)/ 2;
            if (arr[mid]==target){
                return mid;
            }else if (arr[mid]<target){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;

    }


}
