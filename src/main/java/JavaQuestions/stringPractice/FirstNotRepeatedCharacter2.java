package JavaQuestions.stringPractice;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatedCharacter2 {
    // Solution 2 by using collection Map<>

    public static void main(String[] args) {
        String input = "AABBCDDE";

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < input.length() -1; i++){

            char ch = input.charAt(i);// getting the characters from the string base on index positions
            //(ch) is my key
            if(map.containsKey(ch)){ // and if map already  contains key
                map.put(ch, map.get(ch) +1); // storing the key as key, but getting the existing value for the character and incrementing by 1
            }else{
                map.put(ch , 1);// if not existing storing the key character as a value 1
            }
        }
        System.out.println(map);  //{A=2, B=2, C=1, D=2}
        //to find first not repeated character from the map that already exist

        for(Map.Entry<Character, Integer> entrySet : map.entrySet()){
           if( entrySet.getValue() == 1 ){
               System.out.println(entrySet.getKey()); //C  First not repeated character from the map
               break;
           }
        }

    }
}
