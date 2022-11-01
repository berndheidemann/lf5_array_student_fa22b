package randomNumbers;

import java.util.Random;

public class RandomNumbers {
    public int[] getRandomNumbers(int number) {
        Random generator = new Random();
        // Array anlegen mit der korrekten Anzahl an Elementen
        int[] response = new int[number];

        for (int i = 0; i < number; i++) {
            // eine Zufallszahl zwischen 1 und 10 erzeugen
            int numberBetweenOneAndTen = generator.nextInt(10);
            // 0,1,2,3,4,5,6,7,8,9
            numberBetweenOneAndTen += 1;
            // 1,2,3,4,5,6,7,8,9,10

            // Zufallszahl in die korrekte stelle im Array speichern
            response[i] = numberBetweenOneAndTen;
        }
        return response;
    }

    public int evaluateArray(int[] randomNumbers, int digit) {
        int counter = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] == digit) {
                counter++;
            }
        }
        return counter;
    }

    public String getRandomNumbersToString(int[] randomNumbers) {
        String response = "";
        for (int i = 0; i < randomNumbers.length; i++) {
            // Die Zahl an der Stelle i wird zu response hinzugefügt
            response += randomNumbers[i];
            // Leerzeichen hinzufügen
            response += " ";
        }
        return response;
    }
}