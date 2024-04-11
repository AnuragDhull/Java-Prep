
class Employee {
    String name;
    int id;

    public void printDetails() {
        System.out.println("name of emplyee :-- " + name);
        System.out.println("id of employee :-- " + id);

    }
}

public class oops_1 {
    public static void main(String[] args) {
        System.out.println("This is a custom class");

        Employee emp1 = new Employee(); // Initiating new wmployee object
        Employee emp2 = new Employee();

        // Setting attributes for emp1
        emp1.name = "Anurag"; // Setting attributes
        emp1.id = 20;

        // Setting attributes for emp2
        emp2.name = "Anmol";
        emp2.id = 22;

        emp1.printDetails();
        emp2.printDetails();
    }
}
