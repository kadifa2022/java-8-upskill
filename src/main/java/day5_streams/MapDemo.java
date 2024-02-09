package day5_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MapDemo {//map Method

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(52);

//        Stream s = list.stream().map(i->i*i);
//        s.forEach(x-> System.out.println(x));

        list.stream().map(i->i*i).forEach(x-> System.out.println(x));

        //get Stream object(creating stream object)
        Stream<Integer> openSteam = list.stream();
        //Configure Stream by filtering out required value
        Stream<Integer> filteredStream = openSteam.filter(i-> i>= 20);
        List<Integer> newFilteredStream = filteredStream.collect(Collectors.toList());
        newFilteredStream.stream().forEach(y-> System.out.println(y));

         List<Integer> newList=list.stream().filter(i->i>=20).collect(Collectors.toList());
        newList.forEach(x-> System.out.println(x));
    }
}
