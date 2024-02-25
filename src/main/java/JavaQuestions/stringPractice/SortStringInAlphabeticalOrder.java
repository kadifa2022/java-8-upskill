package JavaQuestions.stringPractice;

public class SortStringInAlphabeticalOrder {
    public static void main(String[] args) {
        // two different ways to sort String in Alphabetical order
        //Without using sort method
        //with using sort method
        String str = "123rock#%$&";

        //First approach: Without using sort method
        //replaceAll() put the empty string if we have any other characters except "[^a-zA-Z0-9]"
        String plainString = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainString);
    }


}
