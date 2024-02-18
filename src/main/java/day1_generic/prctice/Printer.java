package day1_generic.prctice;

import java.io.Serializable;

public class Printer <T ,V >{

    T thingToPrint;
    V otherThingToPrint;

    public Printer(T thingToPrint, V otherThingToPrint){
        this.thingToPrint = thingToPrint;
        this.otherThingToPrint = otherThingToPrint;
    }
    public void print(){
       // thingToPrint.eat();
        System.out.println(thingToPrint);
    }

}
