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

        // Approach 1
        char[] chArr = str.toCharArray();

        for (int i = chArr.length - 1; i >= 0; i--) {
            System.out.print(chArr[i]);
        }

        System.out.println("------- Approach2 with charAt()-------");

        for(int i = str.length() -1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("-----Approach 3 by using StringBuffer----");

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        System.out.println("Approach4 by using StringBuilder---------");

        StringBuilder sBuilder = new StringBuilder(str);
        System.out.println(sBuilder.reverse());

    }
}