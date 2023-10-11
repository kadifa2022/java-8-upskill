package day1_generic;

public class OddPredicate<T> implements NumberPredicate<T>{


    @Override
    public boolean test(T t) {
        return (Integer)t % 2 ==1; // CAST
    }
}
/*
create a class OddPredicate<T>
		implement the NumberPredicate
		implement test method for odd numbers

 */