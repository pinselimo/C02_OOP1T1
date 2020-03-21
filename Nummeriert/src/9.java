package edu.campus02;

public class MehrdimensionaleArrays {
    public static void main(String[] args) {
        /*
        Mehrdimensionale Arrays sind nichts anderes als ein Array
        in welchem sich statt zB Ganzzahlen, weitere Arrays befinden.
        Auch diese Arrays können wieder Arrays beinhalten.
        Ein Array mit Arrays von ints ist 2 - dimensional.
        Ein Array mit Arrays mit Arrays von Strings ist 3 - dimensional.
        */

        // Bei der Deklaration schreiben wir so viele "[]" hin
        // wie das Array an Dimensionen haben soll
        int[][] arrayVonArrays = int[32][16];

        // Wie schon bei den normalen Arrays lassen sich auch diese
        // mit Werten initialisieren.
        // Dabei muss man darauf achten, die Klammern richtig zu setzen
        // denn nun handelt es sich ja nicht um ein einfaches Array
        // sondern um ein Array aus Arrays ..
        int[][] arrayMitArrays = int[][]{{1,2,3},{2,3,4},{3,4,5}};

        // Die Indizes funktionieren so wie bei normalen Arrays, nur
        // brauchen wir jetzt natürlich jeweils einen für jede Dimension
        int[] erstesArrayInArraysMitArrays = arrayMitArrays[0]; // == {1,2,3}
        int[] zweitesArrayInArraysMitArrays = arrayMitArrays[1]; // == {2,3,4}

        int zweiteZahlImDrittenArray = arrayMitArrays[2/*drittes Array hat Index 2*/][1 /*zweite Zahl hat Index 1 */]
        int ersteZahlImZweitenArray = arrayMitArrays[1][0];
    }
}