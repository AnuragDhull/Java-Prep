class Mobilephone {
    public void ring() {
        System.out.println("Ringiong .... ");
    }

    public void message() {
        System.out.println("Messaging ....");
    }

    public void gaming() {
        System.out.println("brommmmmm ....");
    }
}

public class oops_prac_2 {
    public static void main(String[] args) {
        Mobilephone iphone = new Mobilephone();

        iphone.ring();
        iphone.message();
        iphone.gaming();
    }
}
