public class class25 {
    public static void main(String[] args) {

        int[][] flats = new int[2][3];
        flats[0][0] = 1;
        flats[0][1] = 1;
        flats[0][2] = 1;
        flats[1][0] = 1;
        flats[1][1] = 1;
        flats[1][2] = 1;
        System.out.println(flats[0][0]);
        System.out.println(flats[1][1]);

        // Printing 2-d array
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.println(" ");

            }
        }

    }
}
