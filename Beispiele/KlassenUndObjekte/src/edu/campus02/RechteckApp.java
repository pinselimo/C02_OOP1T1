package edu.campus02;

import edu.campus03.Auto;

// Zum *testen* der Rechteck-Klasse
public class RechteckApp {

    public static void main(String[] args) {
        // Rechteck muss nicht importiert werden
        // da es sich im selben Paket (edu.campus02)
        // befindet
        // Wichtig ist dabei das "package edu.campus02;"
        // Statement am Anfang der Datei!
        // Wir deklarieren eine Referenzvariable mit Typ "Rechteck"
        Rechteck testRechteck;
        // Dann initialisieren wir diese Referenzvariable auf ein neues Objekt vom Typ "Rechteck"
        testRechteck = new Rechteck();
        // Dann legen wir die Attribute fest
        testRechteck.breite = 5; // Attribut 1
        testRechteck.laenge = 3; // Attribut 2
        // Dann können wir die Methode benutzen!
        int flaecheDesRechtecks; // Deklarieren einer Variable
        // initialisieren auf den Wert der durch die Methode "flaeche" berechnet wird
        flaecheDesRechtecks = testRechteck.flaeche(); // Methode

        System.out.println(flaecheDesRechtecks);

        // Wir können noch ein neues Rechteck machen
        Rechteck zweitesRechteck = new Rechteck();
        zweitesRechteck.laenge = 13;
        zweitesRechteck.breite = 10;

        System.out.println("Erstes Rechteck, Breite: " + testRechteck.breite);
        System.out.println("Zweites Rechteck, Breite: " + zweitesRechteck.breite);

        System.out.println("Erstes Rechteck, Fläche: " + testRechteck.flaeche());
        System.out.println("Zweites Rechteck, Fläche: " + zweitesRechteck.flaeche());

        Rechteck drittesRechteck = new Rechteck();
        drittesRechteck.laenge = 13; // gleich wie bei zweitesRechteck
        drittesRechteck.breite = 10; // gleich wie bei zweitesRechteck

        boolean istGleichesObjekt = zweitesRechteck == drittesRechteck;
        boolean sindRechteckeGleich = zweitesRechteck.equals(drittesRechteck);

        System.out.println("Gleiches Objekt: " + istGleichesObjekt);
        System.out.println("Rechtecke gleich: " + sindRechteckeGleich);

        Auto auto = new Auto();
        String autoName = Auto.marke; // marke ist static und daher für alle Autos immer gleich
        auto.name = "Karl";
        // System.out.println(auto.name);
    }
}
