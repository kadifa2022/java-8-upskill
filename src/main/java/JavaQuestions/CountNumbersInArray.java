package JavaQuestions;

public class CountNumbersInArray {

    public static void main(String[] args) {


        int [] numbers = new int[]{4,7,1,9,8,3,5,0};

        // count through numbers
        for (int num: numbers) {
            if(num == 8){
                System.out.println("=>" + num + "<=");
                break;
            }
            System.out.println(num +", ");

        }
    }
}
