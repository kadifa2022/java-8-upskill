package day5_streams;

import java.util.stream.Stream;

public class OfDemo {
    //How process elements using of()
   // Stream object is not applicable just for the collections, it is also applicable for "ANY GROUP OF VALUE"
    //Even for arrays you can use stream
    //Stream.Of(0 this method can take any group of values and
    // convert them to stream so that multiple stream operations can be applied to it
    public static void main(String[] args) {
        Stream.of(1,11,111,1111,11111,111111).forEach(x-> System.out.println(x));

        String [] name= {"Code","Decode","Demos"};
                // name greater than 4 character
        Stream.of(name).filter(x->x.length()>4).forEach(x-> System.out.println(x));
    }
}
