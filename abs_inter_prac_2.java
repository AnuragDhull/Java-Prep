class Monkey {
    public void jump() {
        System.out.println("!! jumping jumpang jump !!");
    }

    public void bite() {
        System.out.println("!! i can bite u hooo !!");
    }
}

interface BasicAnimal {
    public void eat();

    public void sleep();
}

class Human extends Monkey implements BasicAnimal {
    public void sleep() {
        System.out.println(" sleeping Zzzzzz !!");
    }

    public void eat() {
        System.out.println("I am eating !!!");
    }
}

public class abs_inter_prac_2 {
    public static void main(String[] args) {
        Human anurag = new Human();
        anurag.bite();
        anurag.sleep();
        anurag.eat();
    }
}
