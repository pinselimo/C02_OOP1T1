package edu.campus02;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // bottlesOfBeer(99,96);
        // pinguinSchleife(4);
        doWhileHerunter(10,13);
        herunterzaehlen(10,13);
    }

    public static void doWhileBottles(int flaschen) {
        String text1 = " bottles of beer on the wall ";
        String text2 = " bottles of beer";
        String text3 = "Take one down, pass it around ";

        do {
            System.out.println(flaschen + text1 + flaschen + text2);
            flaschen--;
            System.out.println(text3 + flaschen + text1);
        } while ( flaschen > 1);

        System.out.println("One last bottle of beer on the wall, one last bottle of beer");
        System.out.println("Take it down, pass it around, no more bottles of beer on the wall");
    }

    public static void doWhileHerunter(int von, int bis) {
        int zahl = von;
        int ende = bis;
        System.out.println("Do-While Schleife:");
        do {
            System.out.println(zahl);
            zahl--;
        } while (zahl >= ende);
    }

    public static void herunterzaehlen(int von, int bis) {
        int zahl = von;
        int ende = bis;
        System.out.println("While Schleife:");
        while ( zahl >= ende ) {
            System.out.println(zahl);
            zahl--;
        }
    }

    public static void pinguinSchleife(int wiederholungen) {
        while ( wiederholungen > 0 ) {
            System.out.println("Der Pinguin las Zeitung, da stand:");
            wiederholungen--;
        }
    }

    public static void bottlesOfBeer(int flaschen, int ende) {
        if (flaschen < ende) {
            return;
        }
        String text1 = " bottles of beer on the wall ";
        String text2 = " bottles of beer";
        String text3 = "Take one down, pass it around ";

        if (flaschen == 1) {
            text1 = " bottle of beer on the wall ";
            text2 = " bottle of beer";
            text3 = "Take it down, pass it around ";
        } else if ( flaschen == 0) {
            System.out.println("No more beer on the wall!");
            return;
        }

        System.out.println(flaschen + text1 + flaschen + text2);
        // Lange Variante
        flaschen = flaschen - 1;
        System.out.println(text3 + flaschen + text1);

        // Kurze Variante:
        // System.out.println(text3 + --flaschen + text1);

        bottlesOfBeer(flaschen, ende);
    }


}
