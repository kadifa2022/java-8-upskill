package JavaQuestions.palindrome;

public class PalindromeVerifier {

    public static boolean isPalindrome(String str){
        final var simplified = simplifyString(str);

        final var reversedSimplify = new StringBuilder(simplified).reverse()
                .toString();
        return reversedSimplify.equals(simplified);
    }

    public static String simplifyString(String str){
       return str.toLowerCase().replaceAll("[^a-z0-9]","");


    }


}
