interface MyCamera {
    void takeSnap();

    void recordVideo();

    default void record4kVideo() {
        System.out.println("Recording in 4k !!");
    }
}

interface MyWifi {
    String[] getNetworks();

    void connectNetworks(String network);
}

class MyCellPhone {
    void callNumber(long phoneNumber) {
        System.out.println("Calling .... " + phoneNumber);
    }

    void pickNuber(long phoneNumber) {
        System.out.println("Connected .... " + phoneNumber);
    }
}

class MySmartphone extends MyCellPhone implements MyCamera, MyWifi {
    public void takeSnap() {
        System.out.println("kich  kich  !!!!!!");
    }

    public void recordVideo() {
        System.out.println("action camera !!!!!!! ");
    }

    public void record4kVideo() {
        System.out.println("Recording in 4k !!");
    }

    public String[] getNetworks() {
        System.out.println("List of networks");
        String[] networkList = { "LPU Hostels", "Wirelss", "Anurag5G" };
        return networkList;
    }

    public void connectNetworks(String network) {
        System.out.println("Connected to " + network);
    }
}

public class polymorphism_1 {
    public static void main(String[] args) {
        MyCamera cam1 = new MySmartphone();
        // cam1.getNetworks() // this we canot do we just use camera features
        cam1.recordVideo(); // allowed
    }
}
