package JavaQuestions.stringPractice;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachCharacter {

    public static void main(String[] args) {
        // toCharArray() -method is converting string to char [] array
        // map.put(ch, 1) -used to store data key and value
        // containsKey(key) -> if the key is represented in map
        // get(key) get the existing value from the key increment++
        // if is not represented, than store key with the value as 1

        String input = "hii";
        Map<Character, Integer> map = new HashMap<>();

       char [] chars = input.toCharArray();

        for (char ch: chars) {
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                int value = map.get(ch);
                map.put(ch, value +1);
            }
        }
        System.out.println(map);


//
//        String input = "hello";
//        Map<Character, Integer> map =new  HashMap<>();
//
//        char [] chars =input.toCharArray();
//
//        for (char ch: chars) {
//            if(!map.containsKey(ch)){
//                map.put(ch, 1);
//            }else{
//               int value = map.get(ch);
//               map.put(ch,value +1);
//            }
//
//        }
//        System.out.println(map);
//



    }



}
