package day1_generic.prctice;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {// generic doesn't work with primitive data type
//
//        List<Integer> intList = new ArrayList<>();
//        intList.add(3);
//        printList(intList);


        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);


//        shout("John", 74);
//        shout(57);
//        shout(new Cat());

    }
    // wild card ? that takes any type of objects in parameter
    private static  void printList(List<? extends Animal> myList){
        System.out.println();

    }



//        private static <T, V> T shout(T thingToShout, V otherThingsToShout){
//            System.out.println(thingToShout + "!!!!!!" );
//            System.out.println(otherThingsToShout + "!!!!!!!!!");
//            return thingToShout;
//        }

//       Printer<Integer> printer = new Printer<>(23);
//        printer.print();
//
//        Printer<Double> doublePrinter = new Printer<>(33.5);
//        doublePrinter.print();
//        // <Object>can not be converted to cat needs to be cast
//        ArrayList<Cat> cats = new ArrayList<>();//
//        cats.add(new Cat());
//        Cat myCat = cats.get(0);
 // with Object
       // cats.add(new Dog()); classException will accused
//        cats.add(new Dog());
       //  Cat myCat = (Cat)cats.get(0); // compiler error
    }

