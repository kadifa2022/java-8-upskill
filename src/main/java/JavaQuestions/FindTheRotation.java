package JavaQuestions;

public class FindTheRotation {

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDFB";

        if(isRotation(str1, str2)){
            System.out.println("Rotation of String is present");
        }else{
            System.out.println("Rotation not found");
        }
    }
    public static boolean isRotation(String str1, String str2){
        //check if the string are equal
       return  (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) !=-1);

    }

}
