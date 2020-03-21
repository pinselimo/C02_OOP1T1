package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        pinguinSchleife(4);
        doWhileHerunter(10,4);
    }

    public static void pinguinSchleife(int wiederholungen) {
        do {
            System.out.println("Der Pinguin las Zeitung, da stand:");
            wiederholungen--;
        } while( wiederholungen > 0 );
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
}