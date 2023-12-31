package day6_Optional_BigDecimal;

import com.sun.security.jgss.GSSUtil;
import day4_Streams.Task.Trader;
import day4_Streams.Task.Transaction;

import java.util.*;
import java.util.stream.Collectors;

public class StockMarket {
    public static void main(String[] args) {

        Trader[] traders = {
                new Trader("David", "Virginia"),
                new Trader("Jika", "Chicago"),
                new Trader("Mark", "New York"),
                new Trader("Maria", "New York"),
                new Trader("Emre", "Chicago"),
                new Trader("Olesea", "New York"),
                new Trader("Alma", "Virginia"),
        };

        List<Transaction> transactions = new ArrayList<>(Arrays.asList(
                new Transaction(traders[0], "Apple", 2019, 1000),
                new Transaction(traders[3], "Tesla", 2020, 2500),
                new Transaction(traders[2], "Meta", 2022, 1200),
                new Transaction(traders[1], "Uber", 2018, 400),
                new Transaction(traders[4], "Ford", 2019, 1400),
                new Transaction(traders[2], "Amazon", 2023, 3400),
                new Transaction(traders[6], "Apple", 2020, 1300),
                new Transaction(traders[5], "Meta", 2018, 700),
                new Transaction(traders[4], "Meta", 2019, 600),
                new Transaction(traders[6], "Ford", 2019, 340),
                new Transaction(traders[2], "Uber", 2020, 890),
                new Transaction(traders[3], "Apple", 2020, 1290),
                new Transaction(traders[1], "Uber", 2023, 820),
                new Transaction(traders[0], "Amazon", 2017, 1230),
                new Transaction(traders[5], "Uber", 2016, 980),
                new Transaction(traders[3], "Ford", 2018, 650),
                new Transaction(traders[6], "Meta", 2023, 1320),
                new Transaction(traders[0], "Tesla", 2023, 2300)
        ));

        System.out.println("==============sum of all the transactions===============");
        double sumOfAll = transactions.stream()
                .mapToDouble(Transaction::getValue )
                .sum(); // returning double value
        System.out.println(sumOfAll);


        System.out.println("==============sum of all the transactions   in 2020 ===============");
        double sumOf2020 = transactions.stream()
                .filter(p->p.getYear()==2020)
                .mapToDouble(Transaction::getValue )
                .sum(); // returning double value
        System.out.println(sumOf2020);


        System.out.println(" ==============find the average of david's transaction===============");
       OptionalDouble davidAvg = transactions.stream()
                .filter(p->p.getTrader().getName().equals("David"))
                .mapToDouble(Transaction::getValue )
                .average(); // returning double value
        //System.out.println(davidAvg.getAsDouble());
        davidAvg.ifPresent(System.out::println); // if the name  is not present

        System.out.println("==========find Tesla biggest transaction==================");

      OptionalDouble teslaMax= transactions.stream()
                .filter(p->p.getCompany().equals("Tesla"))
                .mapToDouble(Transaction::getValue)
                .max();
                if(teslaMax.isPresent()){
                    //code that uses the value somehow
            System.out.println(teslaMax.getAsDouble());
        }

        System.out.println("==========find Tesla biggest transaction==================");
              double teslaMax2 =  transactions.stream()
                        .filter(p->p.getCompany().equals("Tesla"))
                        .mapToDouble(Transaction::getValue)
                        .max()// give me max number or
                        .orElse(0); // give me this by default if exist ( not throw  null pointer exception)
        System.out.println(teslaMax);

        System.out.println("=============find the smallest transaction in New York==============");

       double smallNewYork =  transactions.stream()
                .filter(p->p.getTrader().getCity().equals("New York"))
                .mapToDouble(Transaction::getValue)
                .min()
                .orElseThrow();// this will throw exception if Optional is empty type
        System.out.println(smallNewYork);

        System.out.println("===========With Reduce()=====================");

        Optional<Double> maxWithReduce = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Double::max);
        System.out.println(maxWithReduce);




















    }
}

