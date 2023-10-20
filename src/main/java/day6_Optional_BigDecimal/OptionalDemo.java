package day6_Optional_BigDecimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {


        System.out.println("======Empty Optional ============");

        Optional<String> empty = Optional.empty();// this method/uses/creates an empty Optional object it is still an object
        System.out.println(empty);// Optional.empty

        Optional<String> empty2 = null;// null -> is placeholder for object
        System.out.println(empty2);

       // so far these cause exception
        // System.out.println(empty.get());// no such element exception
       //  System.out.println(empty2.get()); exception null pointer exception


        System.out.println(" ====isPresent()============");

        System.out.println(empty.isPresent());// this gives false because there is not value
       //  System.out.println(empty2.isPresent()); not valid

        System.out.println(Optional.of("Java"). isPresent());
        System.out.println(Optional.ofNullable(empty2).isPresent());// checks for an empty Optional


        System.out.println(" ====findAny()============");

        List<Integer> nums = List.of(3,5,1,5,10,284,23,28,48);
        Optional<Integer> lessThan300 = nums.stream()
                .filter(p->p<300)
                .findAny();//
        System.out.println(lessThan300);

        System.out.println(lessThan300.get());

        System.out.println(" ====findAny-Optional ============");

     //   List<Integer> nums = List.of(3,5,1,5,10,284,23,28,48);
        Optional<Integer> moreThan300 = nums.stream()
                .filter(p->p>300)
                .findAny();//
        System.out.println(moreThan300);
       //   System.out.println(moreThan300.get()); still can't get anything from empty


        System.out.println(" ====ifPresent()============");

        Optional<Integer> moreThan300again = nums.stream()
                .filter(p->p>300)// to check invalid you can use 300
                .findAny();//
       moreThan300again.ifPresent(System.out::println);//  consumer does not return anything


        System.out.println(" ====orElse()= ===========");

        Optional<Integer> moreThan3 = nums.stream()
                .filter(p->p>300)
                .findAny();
        System.out.println(moreThan3.orElse(-1));

    }
}
