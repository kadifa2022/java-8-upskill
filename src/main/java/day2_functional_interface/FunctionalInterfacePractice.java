package day2_functional_interface;

import java.util.function.BiFunction;

public class FunctionalInterfacePractice {
    public static void main(String[] args) {
        //int a= 10, b =20;
        //(a,b) -> a+b;
        BiFunction<Integer, Integer, Integer> biF = (a,b) -> a +b  ;
        System.out.println(biF.apply(10, 20));


    }


}
