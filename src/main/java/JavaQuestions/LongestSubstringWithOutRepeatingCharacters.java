package JavaQuestions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithOutRepeatingCharacters {

    public static void main(String[] args) {

    }
// solution 1 slow / not good
    public  int lengthOfLongestSubstring2(String s){
        int maxLength =0;
        for(int i =0; i< s.length(); i++ ){
            StringBuilder currentSubstring = new StringBuilder();
            for(int j = i; j<s.length(); j++){
                if(currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1){
                    break;
                }
            currentSubstring.append(s.charAt(j));
                maxLength = Math.max(maxLength,currentSubstring.length());
            }

        }

        return maxLength;
    }

// solution2  with map
    public int lengthOfLongestSubstring(String s){

        // sliding window hashMap algo
        int maxLength = 0;

        Map<Character, Integer> visitedCharacters = new HashMap<>();// to hold visited character

        for(int right =0, left =0; right<s.length(); right ++){
            char currentCharacter = s.charAt(right);

            if(visitedCharacters.containsKey(currentCharacter) &&
            visitedCharacters.get(currentCharacter) >= left ){
                left = visitedCharacters.get(currentCharacter) +1;
            }
            maxLength = Math.max(maxLength, right -left +1);
            visitedCharacters.put(currentCharacter, right);

        }
        return maxLength;



    }
// solution3 with more improvement// better performance

    public int longestSubstring(String str){
        int maxLength= 0;
        for(int right =0, left =0; right <str.length(); right++){
            int indexOfFirstAppearanceInSubstring = str.indexOf(str.charAt(right), left);
            if(indexOfFirstAppearanceInSubstring != right){
                left = indexOfFirstAppearanceInSubstring +1;
            }
            maxLength = Math.max(maxLength,right -left +1);
        }
        return maxLength;
    }




}
