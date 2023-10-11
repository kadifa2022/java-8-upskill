package day1_generic.student;

public class Cydeo {

    public static void main(String[] args) {
        // before generics _this is unprotected Type

        Batch  batch5 = new Batch("B5");// Added new array list all together
        batch5.addStudent(new SdetStudent("Eren"));
        batch5.addStudent(new SdetStudent("Salma"));
        batch5.addStudent(new SdetStudent("Eduard"));
        batch5.addStudent(new SdetStudent("Svitlana"));
        batch5.addStudent(new SdetStudent("Val"));
        batch5.addStudent(new SdetStudent("James"));
        batch5.addStudent(new SdetStudent("Anna"));
        batch5.addStudent(new SdetStudent("Kelly"));

        // we protect type by using the Generic
        Batch<SdetStudent>  b6 = new Batch("B5");// Added new array list

        b6.addStudent(new SdetStudent("Eren"));
        b6.addStudent(new SdetStudent("Salma"));
        b6.addStudent(new SdetStudent("Eduard"));
//        b6.addStudent(new DevStudent("Svitlana"));
//        b6.addStudent(new DevStudent("Val"));
//        b6.addStudent(new DevStudent("James"));
//        b6.addStudent(new CyberSecurityStudent("Anna"));
//        b6.addStudent(new CyberSecurityStudent("Kelly"));

        Batch <CyberSecurityStudent> cB6 = new Batch<>("B6");

        cB6.addStudent(new CyberSecurityStudent("Anna"));
        cB6.addStudent(new CyberSecurityStudent("Kelly"));

        Batch<DevStudent> dS = new Batch<>("B7");

        dS.addStudent(new DevStudent("Svitlana"));
        dS.addStudent(new DevStudent("Val"));
        dS.addStudent(new DevStudent("James"));


    }
}
