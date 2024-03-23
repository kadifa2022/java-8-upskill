package day3_doubleColon_and_coparator.comparator;

public class Employee {

    private int id;
    private String name;


    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o){
        if(o ==null || getClass() !=o.getClass()){
            return false;
        }
        if(o == this){
            return true;
        }
        Employee e = (Employee) o;
        return (this.getId()== e.getId());
    }

    public int hashCode(){
        return getId();
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
