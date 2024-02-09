package day2_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleRunner {
    public static void main(String[] args) {
        List<Apple> data = new ArrayList<>(Arrays.asList(
                new Apple("Red", 30),
                new Apple("Red", 50),
                new Apple("Green", 55),
                new Apple("Green", 100),
                new Apple("Yellow", 40),
                new Apple("Yellow", 70),
                new Apple("Green", 58),
                new Apple("Red", 65)
        ));

                                    //behavior parameterization
        List<Apple> greenApples = filter(data, new AppleGreenColorPredicate());// first solution
        System.out.println(greenApples);

        // second solutions -> with lambda we don't need extra steps
        List<Apple> smallApples = filter(data, apple ->apple.getWeight() < 70);
                                           //(parameter)-> {statement} lambda
        System.out.println(smallApples);

    }

    // method for filtering apples by weight, color, weight etc..( different actions)
    public static List<Apple> filter(List<Apple> apples, ApplePredicate applePredicate){
        List<Apple> filteredApples = new ArrayList<>();
        for(Apple each: apples){
            if(applePredicate.test(each)){
                filteredApples.add(each);

            }
        }
    return  filteredApples;
    }

}
