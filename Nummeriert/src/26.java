package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Wir initialsieren Herbert
        Tamagochi herbert = new Tamagochi(6,4,5);
        // Wir geben dem Tamagochi-Objekt
        // seine vorgegebenen Attribut-Werte
        herbert.xKoordinate = 6;
        herbert.yKoordinate = 4;
        herbert.futterstand = 5;

        // Die Aufgabe ist zu X=0; Y=0 zu gelangen
        // und dabei nur 5 Punkte zu füttern

        // wir gehen also 4 Schritte nach unten
        herbert.gehe("unten",4);

        // füttern das tamagochi mit 5 Punkten
        herbert.fuettere(5);

        herbert.gehe("links",6);

    }
}
