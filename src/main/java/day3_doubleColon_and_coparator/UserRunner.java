package day3_doubleColon_and_coparator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class UserRunner {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User("Jbond", "007"),
                new User("javaLover", "java"),
                new User("sdetFan", "testing"),
                new User("programmingIsFun", "java")
        ));

        // iterate
       users.forEach(user -> System.out.println(user));// as a lambda version
       users.forEach(System.out::println);//as a method reference version

        users.removeIf(p->p.getPassword().equals("Java"));
        System.out.println("After Removing");
        users.forEach(System.out::println);

        BiFunction<String, String,User> createUser = (user, pass)-> new User(user, pass);
        User newUser = createUser.apply("catsAreTheBest", "nODogs");

        BiFunction<String, String, User> createUser2 = User::new;
        User newUser2 = createUser2.apply("dogsAreBetter", "noCats");

        }

    }

