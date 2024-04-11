
class Employee {
    int salary;
    String name;

    public int getSal() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class oops_prac_1 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "Anurag";
        emp.salary = 100;

        System.out.println(emp.getName());
        System.out.println(emp.getSal());

        emp.setName("jaat");
        System.out.println(emp.getName());

    }
}
