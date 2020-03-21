package edu.campus02;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        // Aufgabe 1: Erstelle eine Ganzzahlen-Array der Länge 100
        int[] ganzzahlenArray = new int[100];
        // Aufgabe 2: Fülle das Array mit den Quadraten der Werte 200 - 300
        for (int index = 0; index <= ganzzahlenArray.length-1; index++) {
            /*
            Der index läuft über alle Indizes im Array!
            d.h.: Er fängt bei 0 an, das ist der Index des ersten Wertes im Array
                  Und er läuft bis zum Wert array.length-1, denn das ist der
                  Index des letzten Elements im Array!

             Wir wollen aber Werte von 200 bis (exkl.) 300 haben.
             Daher addieren wir zum Index 200 dazu, und quadrieren erst dann.
             Das Ergebnis davon speichern wir auf der Variable "zahl" und
             dann im Array am Platz mit dem Index "index"
             */
            int zahl = index + 200;
            // int quadrat = zahl * zahl;
            ganzzahlenArray[ index ] = zahl;
        }

        // Aufgabe 3: Benutze eine For-Each Schleife um alle Werte auszugeben
        //            welche durch 3 teilbar sind.
        for (int element : ganzzahlenArray) {
            // Ist eine Zahl durch 3 teilbar, ist der Rest der Division gleich 0!
            if (element % 3 == 0) {
                System.out.println(element);
            }
        }
    }
}