package JavaQuestions;



public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("anavolimilovana"));

    }

    public static boolean isPalindrome(String s){

        int left = 0, right = s.length() -1;
        while(left <right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;

        }
        return true;
    }


    public static boolean isPalindrome2(String s){

        int left = 0, right = s.length()-1;

        while(left< right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return  true;
    }



}
