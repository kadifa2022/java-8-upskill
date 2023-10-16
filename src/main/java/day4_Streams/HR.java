package day4_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HR {
    public static void main(String[] args) {
        List<Application> applicationList = new ArrayList<>(Arrays.asList(
                new Application("Molly", 100_00, true),
                new Application("James", 110_000, false),
                new Application("Emre", 120_000, true),
                new Application("Oleg", 120_000, false),
                new Application("Ella", 95_000, true),
                new Application("Poppy", 135_000, false)
        ));


        System.out.println("Application that willing to relocated");
        applicationList.stream() // p is application object
                .filter(Application::isWillingToRelocate)//(p-> p.isWillingToRelocate()
                .forEach(System.out::println);


        System.out.println("Application that willing to relocated-show their names");

        applicationList.stream() // p is application object
                .filter(Application::isWillingToRelocate)//(p-> p.isWillingToRelocate()
                .map(Application::getName)//application -> application.getName()
                .forEach(System.out::println);

        System.out.println("Application are execting less than 125,00");

        applicationList.stream() // p is application object
                .filter(p-> p.getExpectedSalary()<125_000)

                .forEach(System.out::println);

        System.out.println("Application are expecting less than 125,00isWillingToRelocate ");

        applicationList.stream() // p is application object
                .filter(p-> p.getExpectedSalary()<125_000)
                .filter(Application::isWillingToRelocate)//(p-> p.isWillingToRelocate()
                 .forEach(System.out::println);

        System.out.println("Application sorted by salary lowest to  highest ");

        applicationList.stream() // p is application object
                .sorted(Comparator.comparing(Application::getExpectedSalary))  // app -> app.getExpectedSalary
                .forEach(System.out::println);



        System.out.println("Application sorted by salary lowest to  highest  but only look at 3");

        applicationList.stream() // p is application object
                .sorted(Comparator.comparing(Application::getExpectedSalary))  // app -> app.getExpectedSalary
                .limit(3)
                .forEach(System.out::println);



    }
}
