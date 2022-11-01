package volumeFilter;

public class VolumeFilter {

    public int[] smoothValues(int[] values) {

        int[] response = new int[values.length];

        // den ersten Wert berechnen
        // Berechne für das erste Element von
        // geglaettet den Durchschnitt der ersten
        // zwei Elemente von signal.
        int first = values[0];
        int second = values[1];
        response[0] = (first + second) / 2;

        // den letzten Wert berechnen
        int indexOfLastElement = values.length - 1;
        int last = values[indexOfLastElement];
        int indexOfSecondLastElement = values.length - 2;
        int secondLast = values[indexOfSecondLastElement];
        response[values.length - 1] = (last + secondLast) / 2;

        // alle anderen Werte berechnen
        // Schleife vom zweiten bis zum vorletzten Index
        for (int i = 1; i <= values.length - 2; i++) {
            // Vorgänger
            int prev = values[i - 1];
            // den aktuellen
            int current = values[i];
            // den Nachfolger
            int next = values[i + 1];

            int avg = (prev + current + next) / 3;
            response[i] = avg;
        }

        return response;
    }
}
