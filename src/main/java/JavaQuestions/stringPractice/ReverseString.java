package JavaQuestions.stringPractice;

public class ReverseString {
    /*
    4 ways to reverse String
    - using toCharArray() method
    - using charAt(int index) method
    - using java.lang.StringBuffer class provided reverse() method
    - using java.lang.StringBuilder class provided reverse() method
      str.length() is provided by String class
      char[] chArray = str.toCharArray();

 */

    // write a program to reverse a String
    // Input : hello
    //output : olleh
    public static void main(String[] args) {
        String str = "Hello";
        char[] chArr = str.toCharArray();

        for (int i = chArr.length - 1; i >= 0; i--) {
            System.out.print(chArr[i]);


        }
    }
}