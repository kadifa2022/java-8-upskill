package day5_streams;


import java.util.ArrayList;
import java.util.List;



public class FilterDemo {
    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<>();
        arrList.add(15);
        arrList.add(25);
        arrList.add(52);
//        Stream s = arrList.stream().filter(i->i%2 ==0);
//                s.forEach(x-> System.out.println(x));
//simplify in single line
        arrList.stream().filter(i->i%2 ==0).forEach(x-> System.out.println(x));
    }
}
