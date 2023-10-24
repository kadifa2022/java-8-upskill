package day6_Optional_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double d = 10.99;
        double d2 = 2.99;
        System.out.println(d-d2);
                        // constructor call
        BigDecimal d3 = new BigDecimal("10.99"); // with BigDecimal is better to use string
        BigDecimal d4 = new BigDecimal("2.99");
        // with object type we have methods (subtract, add
        System.out.println(d3.subtract(d4));

        // related with money BigDecimal CEILING AND FLOOR
        BigDecimal d5 = new BigDecimal("23.1251");
        System.out.println(d5.setScale(1, RoundingMode.CEILING));// ceiling is rounding number up
        System.out.println(d5.setScale(1, RoundingMode.FLOOR));// FLOOR IS rounding down
        System.out.println(d5.setScale(2, RoundingMode.CEILING));// ceiling is rounding number up
        System.out.println(d5.setScale(2, RoundingMode.FLOOR));// FLOOR IS rounding down
        System.out.println(d5.setScale(3, RoundingMode.CEILING));// ceiling is rounding number up
        System.out.println(d5.setScale(3, RoundingMode.FLOOR));// FLOOR IS rounding down

        System.out.println(d5.subtract(new BigDecimal("1.1")));


    }




}
