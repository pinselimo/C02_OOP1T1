package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bottlesOfBeer(99,0);
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