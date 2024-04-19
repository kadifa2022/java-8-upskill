package JavaQuestions;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {


        String s = "adadddddaddfffghsss";

        Map<Character, Integer> frequencyMap = frequency(s);
        frequencyMap.forEach((key,value) -> System.out.println("Element: " + key + ", Occurrences: " + value));
    }




    private static Map<Character, Integer> frequency(String sentence){
        Map<Character, Integer> frequencyMap= new HashMap<>();
        for(Character ch: sentence.toCharArray())
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch,0)+1);
        return frequencyMap;

    }


}
