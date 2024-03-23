package day3_doubleColon_and_coparator.comparator;

import day3_doubleColon_and_coparator.comparator.Employee;

import java.util.Arrays;

public class EmployeeRunner {

    public static void main(String[] args) {
        int [] intArr = {5,9,1,10};//array primitive objects
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        Employee [] empArray = new Employee[4]; //custom object
        empArray[0] = new Employee(5,"John");
        empArray[1] = new Employee(9,"Amit");
        empArray[2] = new Employee(1,"Poul");
        empArray[3] = new Employee(10,"Ane");

        Arrays.sort(empArray);// java can't sort custom objects in the way the sort [] of  primitive type that's why  we have exception
        System.out.println("Default sorting of Employees list:\n " + Arrays.toString(empArray));

    }
}
/*
class java.lang.Comparable (day3_doubleColon_and_coparator.comparator.Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
	at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
	at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
	at java.base/java.util.Arrays.sort(Arrays.java:1249)
	at day3_doubleColon_and_coparator.comparator.EmployeeRunner.main(EmployeeRunner.java:18)

 */
