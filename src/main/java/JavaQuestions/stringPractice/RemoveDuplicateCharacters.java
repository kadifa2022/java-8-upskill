package JavaQuestions.stringPractice;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        String str = "programing";

      // Approach -1 with Java 8
      StringBuilder sb1 = new StringBuilder();
      str.chars().distinct().forEach(c->sb1.append((char) c));
        System.out.println(sb1);
    }
}
