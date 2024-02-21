package JavaQuestions;

public class PalindromeChecker {


    public static boolean isPalindromeNumber(int x){
        // convert the integer to a string
        String original = String.valueOf(x);

        // use two pointers to compare characters from both ends of the string
        int left = 0,right =original.length()-1;

        while(left<right){
            if (original.charAt(left) != original.charAt(right));
            left ++;
            right --;
        }
        return true;
    }

}
