
public class Var_arg {

     static int sum(int... arr) {
          int result = 0;
          for (int i = 0; i < arr.length; i++) {
               result = result + arr[i];
          }
          return result;
     }

     public static void main(String[] args) {

          //// Variable arguments ////

          System.out.println("sum :-- " + sum(1, 2));
          System.out.println("sum :-- " + sum(1, 2, 3));
          System.out.println("sum :-- " + sum(1, 2, 3, 4));

     }
     //// Variable arguments ////

}
