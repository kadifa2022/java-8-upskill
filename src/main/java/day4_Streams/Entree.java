package day4_Streams;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Entree {

    private String name;
    private int calories;
    private boolean isVegetarian;
}
