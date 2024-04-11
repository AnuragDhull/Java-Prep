class Employee {
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
        // u can also write this.name=n

    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
        // u can also write this.id=i
    }

    public int getId() {
        return id;
    }

}

public class get_set_1 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // emp.name="Anurag"; *Throws an error due to private acess
        // emp.id=20; modifier *

        emp.setName("Anurag");
        emp.setId(20);
        System.out.println("Name :-- " + emp.getName());
        System.out.println("Id :--" + emp.getId());
    }
}