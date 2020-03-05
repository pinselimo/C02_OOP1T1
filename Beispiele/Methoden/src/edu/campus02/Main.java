package edu.campus02;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int fl = flaeche(1,3);
        int fl2 = flaeche(4,5);

        System.out.println("FL1:" + fl);
        System.out.println("FL2:" + fl2);
    }

    public static int flaeche(int hoehe, int breite) {
        int ergebnis;
        ergebnis = hoehe*breite;
        return ergebnis;
    }



}
