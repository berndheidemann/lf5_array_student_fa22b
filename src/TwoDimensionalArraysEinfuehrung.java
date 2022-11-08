public class TwoDimensionalArraysEinfuehrung {

    public static void main(String[] args) {

        int[] arr = new int[4];
        //   4, 7, 1, 3

        /*  int[][] a=new int[4][3]
             . --> { 1, 2, 3 }
             . --> { 6, 1, 2 }
             . --> { 1, 2, 3 }
             . --> { 2, 1, 3 }

             a[1] ---> ich bekomme das Array mit: { 6, 1, 2 }
             a[1][0] --> ich bekomme die Zahl 6
         */

        int[][] arr2d = new int[7][4];

        arr2d[6][3] = 12;
        System.out.println(arr2d[6][3]);

        System.out.println("Anzahl der Zeilen: " + arr2d.length);
        System.out.println("Anzahl der Spalten: " + arr2d[0].length);


    }
}
