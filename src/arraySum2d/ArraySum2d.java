package arraySum2d;

public class ArraySum2d {
    public int sumAll(int[][] array) throws IllegalArgumentException {
        if (array == null || array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException();
        }
        // Die Summe aller Werte in einem 2D-Array zu berechnen
        int sum = 0;
        // Schleifenkonstrukt, dass alle Werte im 2D-Array einmal anspricht
        // Durch alle Reihen gehen
        for (int row = 0; row < array.length; row++) {
            // Durch alle Spalten einer Reihe gehen
            int colCount = array[row].length; // --> Anzahl der Spalten dieser einen Reihe
            for (int col = 0; col < colCount; col++) {
                sum += array[row][col];
            }
        }

        // Alternative mit for each-Schleife
//        for(int[] row: array) {    // for(EINZELNES ELEMENT: CONTAINER)
//            for(int value: row) {
//                sum+=value;
//            }
//        }
        return sum;
    }


    /*
                                3 | 5 | 1
                                1 | 2 | 1
                                4 | 2 | 3

                                array[1][0]

     */
    public int[] rowSums(int[][] array) throws IllegalArgumentException {
        if (array == null || array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException();
        }
        // Ein 1D-Array mit den Summen der einzelnen Reihen
        int[] sum = new int[array.length];

        // sum ---> 0 | 0 | 0
        for (int row = 0; row < array.length; row++) {
            // Durch alle Spalten einer Reihe gehen
            int colCount = array[row].length; // --> Anzahl der Spalten dieser einen Reihe
            for (int col = 0; col < colCount; col++) {
                sum[row] += array[row][col];
            }
        }
        // sum --> 9 | 4 | 9
        return sum;
    }


    public int[] colSums(int[][] array) throws IllegalArgumentException {
        if (array == null || array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException();
        }
        // Ein 1D-Array mit den Summen der einzelnen Spalten
        // wie viele Spalten haben wir eigentlich?
        int[] sum = new int[array[0].length];

        // sum ---> 0 | 0 | 0
        for (int row = 0; row < array.length; row++) {
            // Durch alle Spalten einer Reihe gehen
            int colCount = array[row].length; // --> Anzahl der Spalten dieser einen Reihe
            for (int col = 0; col < colCount; col++) {
                sum[col] += array[row][col];
            }
        }
        // sum --> 9 | 4 | 9
        return sum;
    }
}
