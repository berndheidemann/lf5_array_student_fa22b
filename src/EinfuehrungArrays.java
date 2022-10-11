public class EinfuehrungArrays {

    public static void main(String[] args) {

        // int[] -> hier sollen mehrere Ganzzahlen abgespeichert werden können
        // arr -> Das Array hat den Namen arr
        // new --> Schlüsselwort, das deutlich macht, dass etwas erstellt werden
        // int[10] -> Es sollen 10 Elemente abgespeichert werden können
        int[] arr = new int[10];

        // In die Schublade 0 die Zahl 7 abspeichern
        arr[0] = 7;

        // Den Inhalt von Schublade 0 ausgeben
        System.out.println(arr[0]);

        arr[9] = 22;
        System.out.println(arr[9]);

        // Würde eine ArrayIndexOutOfBoundsException geben, da Schublade 10 nicht existiert
        // Der Schrank hat 10 Schubladen --> 0,1,2,3,4,5,6,7,8,9 (Index 10 gibt es nicht)
        // arr[10] = 12;

        for (int i = 0; i < 10; i++) {
            // wir benutzen die Variable i als index für das Array
            arr[i] = i * 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }


    }
}
