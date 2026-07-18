// Immutable Class
//final class
final class Employee {

    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ImmutableDemo {

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Ash");

        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}

//output
//101
//Ash
