package JavaQuestions;

public class Palindrome2 {

    public static void main(String[] args) {
        String str = "racecar";

        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str){
        if(str==null ||str.isBlank()){
            return true;
        }
        str = str.toLowerCase();
        StringBuilder reverseStr = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            reverseStr.append(str.charAt(i));
        }
        return reverseStr.toString().equals(str);
    }

}
