package JavaQuestions;

public class PalindromeChecker {

    public static void main(String[] args) {
        int x = 1231;
        System.out.println(isPalindromeNumber(x));
        x = 12321;
        System.out.println(isPalindromeNumber(x));
    }


    public static boolean isPalindromeNumber(int x){
        // convert the integer to a string
        String original = String.valueOf(x);

        // use two pointers to compare characters from both ends of the string
        int left = 0,right =original.length()-1;

        while(left<right){
            // comparing characters at left and right positions
            if (original.charAt(left) != original.charAt(right)) {
                return false;// if characters not equal, is not palindrome
            }
            //move the pointers towards center
            left ++;
            right --;
        }// if the loop completes without returning false, the integer is a palindrome
        return true;
    }

}
