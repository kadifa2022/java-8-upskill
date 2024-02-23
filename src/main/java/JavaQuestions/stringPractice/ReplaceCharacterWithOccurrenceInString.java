package JavaQuestions.stringPractice;

import java.util.Arrays;

public class ReplaceCharacterWithOccurrenceInString {
    public static void main(String[] args) {


        String input = "opentext"; // replace character T
        char charToReplace = 't';
        //expected output = OPEN1EX2

        // check char presence in String
        if (input.indexOf(charToReplace) == -1) {
            System.out.println("Given character is NOT available in input String");
            System.exit(0);
        }
        int cnt =1;
        //logic to replace char occurrence in string with number

        for(int i=0; i<input.length(); i++){
           char ch = input.charAt(i);
           if(ch ==charToReplace){
              input = input.replaceFirst(String.valueOf(charToReplace),String.valueOf(cnt));
               cnt++;
           }
        }
        System.out.println(input);



//
//        char[] arr = input.toCharArray(); // o p e n t e x t
//        int cnt = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == charToReplace) { //o==t p==t e==t n==t t==t
//               arr[i] = String.valueOf(cnt).charAt(0);
//               cnt++;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
    }}