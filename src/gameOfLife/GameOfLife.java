package gameOfLife;

import java.util.Random;

public class GameOfLife {

    private static final char ALIVE = 'O';
    private static final char DEAD = ' ';
    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;

    char[][] gamefield;

    public void initializeBoard(int number) {
        // Ein Board 12x12 erstellt werden
        // wobei die Zellen nur in den Indizes von 1 bis 10 existieren
        char[][] field = new char[HEIGHT][WIDTH];
        Random rnd = new Random();
        int spawned = 0;
        while (spawned < number) {
            int row = rnd.nextInt(HEIGHT);
            int col = rnd.nextInt(WIDTH);
            if (field[row][col] != ALIVE) {
                field[row][col] = ALIVE;
                spawned++;
            }
        }
        gamefield = field;
    }

    public char[][] getBoard() {
        return gamefield;
    }

    public boolean setAliveCell(int row, int col) {
        row--;
        col--;
        if (gamefield[row][col] != ALIVE) {
            gamefield[row][col] = ALIVE;
            return true;
        }
        return false;
    }

    public char getCellStatus(int row, int col) {
        row--;
        col--;
        return gamefield[row][col];
    }

    public int getAliveCells() {
        // zähle alle lebenden Zellen
        int sum = 0;
        for (int row = 0; row < HEIGHT; row++) {
            for (int col = 0; col < WIDTH; col++) {
                if (gamefield[row][col] == ALIVE) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public void simulate() {
        // einen GameOfLife-Step

        /*
            Variante 1: Die Zelle ist am Leben
                Regel a: bei mehr als 3 Nachbarn tot
                Regel b: bei weniger als 2 Nachbar tot

            Variante 2: Die Zelle ist tot
                Regel: bei exakt 3 Nachbarn --> leben entsteht

            Ich muss für jede Zelle zählen, wieviele Nachbarn sie hat
         */

        char[][] tempField = new char[HEIGHT][WIDTH];

        for (int row = 0; row < HEIGHT; row++) {
            for (int col = 0; col < WIDTH; col++) {

                int neighbours = 0;

                // nachbarn berechnen

                // oben
                if (row > 0 && gamefield[row - 1][col] == ALIVE) {
                    neighbours++;
                }

                // oben rechts
                if (row > 0 && col < WIDTH - 1 && gamefield[row - 1][col + 1] == ALIVE) {
                    neighbours++;
                }

                // rechts
                if (col < WIDTH - 1 && gamefield[row][col + 1] == ALIVE) {
                    neighbours++;
                }

                // unten rechts
                if (row < HEIGHT - 1 && col < WIDTH - 1 && gamefield[row + 1][col + 1] == ALIVE) {
                    neighbours++;
                }

                // unten
                if (row < HEIGHT - 1 && gamefield[row + 1][col] == ALIVE) {
                    neighbours++;
                }

                // unten links
                if (row < HEIGHT - 1 && col > 0 && gamefield[row + 1][col - 1] == ALIVE) {
                    neighbours++;
                }

                // links
                if (col > 0 && gamefield[row][col - 1] == ALIVE) {
                    neighbours++;
                }

                //oben links
                if (row > 0 && col > 0 && gamefield[row - 1][col - 1] == ALIVE) {
                    neighbours++;
                }

                // regeln anwenden
                if (gamefield[row][col] == ALIVE) {
                    if (neighbours > 3 || neighbours < 2) {
                        tempField[row][col] = DEAD;
                    } else {
                        tempField[row][col] = ALIVE;
                    }
                } else {
                    if (neighbours == 3) {
                        tempField[row][col] = ALIVE;
                    } else {
                        tempField[row][col] = DEAD;
                    }
                }
            }
        }
        gamefield = tempField;

    }

    public boolean simulationOver() {
        return false;
    }
}