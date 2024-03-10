package JavaQuestions.book;

import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int [] arr = {3,2,4,1,6};
        printFirstRepeatingElement(arr);

    }
    static void printFirstRepeatingElement(int arr []) {
        int min = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                if (min == -1 || min > 1) {
                    min = i;
                }
                } else {
                    set.add(arr[i]);
                }
            }
            if (min != -1) {
                System.out.println("Repeating element is " + arr[min]);
            }else{
                System.out.println("No Element is repeated in array");
            }
        }
    }
