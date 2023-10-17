package day4_Streams.Task;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {
    private Trader trader;
    private String company;
    private int year;
    private double value;


}
