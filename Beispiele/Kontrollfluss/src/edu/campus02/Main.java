package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int ersteGanzzahl;
        int zweiteGanzzahl;
        boolean bedingung;

        ersteGanzzahl = 1;
        zweiteGanzzahl = 2;

        bedingung = ersteGanzzahl < zweiteGanzzahl;

        if (bedingung) {
            System.out.println("Die Bedingung ist wahr!");
        } else {
            System.out.println("Die Bedingung ist falsch!");
        }

        // Beispiel 2
        int ersteZahl;
        int zweiteZahl;
        int dritteZahl;
        int vierteZahl;

        ersteZahl = 1;
        zweiteZahl = 2;
        dritteZahl = 3;
        vierteZahl = 4;

        if ( ersteZahl == 2 ) {
            System.out.println("Erste!");
        } else if ( zweiteZahl == 2 ) {
            System.out.println("Zweite!");
        } else if ( dritteZahl == 3 ) {
            System.out.println("Dritte!");
        } else {
            System.out.println("Keine!");
        }
    }
}
