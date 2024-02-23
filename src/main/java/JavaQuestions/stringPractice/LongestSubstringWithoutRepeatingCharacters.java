package JavaQuestions.stringPractice;


import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
       lengthOfLongestSubstring("java");



    }

    public static void lengthOfLongestSubstring(String s) { // taking the string as input
        String longestSubstring = null;// declaring two variables
        int longestSubstringLength = 0;
        //creating Map to store date k and v pair
        // we can create object from interface that why i give implementation in the class
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();// linked Hash map keeps the insertion order

       char [] arr = s.toCharArray(); // putting the string in charAt() method
        for(int i = 0; i< arr.length; i++) {// getting elements one by one based on index number
          char ch = arr[i];// from this arr, I'm getting the value based on i index , which will increment number  and store in char ch=
            // any character that i'm getting from array will be stored in map as k,v
            // before storing in the map will check if the map contains k
            if(!map.containsKey(ch)){// if map doesn't contain key I'm going to put key in map
                map.put(ch, i); // key is the ch and value is the i(index position i'm going to store
            }else{ // suppose, if map already contains the key i,
                i = map.get(ch);// will replace i value with the value of the key (ch)
                map.clear();// will clear the least available in map
         }
            if(map.size()> longestSubstringLength){
                longestSubstringLength = map.size();
              longestSubstring= map.keySet().toString();
            }

        }

        System.out.println("The longest substring" +longestSubstring);
        System.out.println("The longest substring length " + longestSubstringLength);


    }
}