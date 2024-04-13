class Employee {

    int id;
    String name;

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public Employee() { // Constructor overloading
        id = 68;
        name = "Anurag";
    }

    public Employee(String myName, int myid) {
        id = 68;
        name = "Anurag";
    }
}

public class constructor_1 {
    public static void main(String[] args) {

        Employee emp = new Employee("anurag", 45);
        // Employee emp =new Employee(); // Constructor overloading
        System.out.println(emp.getName());
        System.out.println(emp.getId());

    }
}
