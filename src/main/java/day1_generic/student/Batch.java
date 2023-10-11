package day1_generic.student;

import java.util.ArrayList;
import java.util.List;

public class Batch <B extends Student>{// represent batch Type generic and has to be subclass of Student

    private String name;
    private List<B> studentsList;

    public Batch(String name) {
        this.name = name;
        studentsList = new ArrayList<>();// didn't do constructor just added // want to get empty list for each Batch (instance)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<B> getStudentList() {//B Generic type
        return studentsList;
    }


    public void addStudent(B student) {// generic type
        studentsList.add(student);
    }
}