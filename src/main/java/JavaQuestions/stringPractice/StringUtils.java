package JavaQuestions.stringPractice;

public class StringUtils {
    public static void main(String[] args) {
        String originalString = "code"; //['c','o','d','e'] count 4, offset = 0
        // how to create substring // first index is inclusive and last index is exclusive
        String subString = originalString.substring(0,2);
        System.out.println(subString);
    }
}
