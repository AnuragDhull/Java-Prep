// public class Thread1 implements Runnable {
//     public void run() {
//         int i = 0;
//         while (i < 100) {
//             System.out.println("I am cooking !!!!");
//             i++;
//         }
//     }
// }

// public class Thread2 implements Runnable {
//     public void run() {
//         int i = 0;
//         while (i < 100) {
//             System.out.println("I am chatting !!!!");
//             i++;
//         }
//     }
// }

// public class thread2 {
//     public static void main(String[] args) {

//         Thread1 t1 = new Thread1();
//         Thread gun1 = new Thread(t1); // Create a Thread object passing Thread1 instance
//         Thread2 t2 = new Thread2();
//         Thread gun2 = new Thread(t2); // Create a Thread object passing Thread2 instance

//         gun1.start();
//         gun2.start();
//     }
// }
