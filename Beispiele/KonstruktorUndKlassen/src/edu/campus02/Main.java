package edu.campus02;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // null-referenzen
        Hund wuffi = new Hund();

        // Variable
        int a;
        a = 0;
        System.out.println(a);

        // Referenzvariable
        // Hier wird nur die Referenz zur wuffi.fellfarbe
        // gespeichert.
        String s = wuffi.fellfarbe;
        System.out.println(wuffi.beinzahl); // Ausgabe: null

        // Die Referenz "null" kann jeden Objekt-Typen
        String lieblingsfarbe = wuffi.lieblingsfarbe();

        // Das kann man sich zunutze machen
        // Man kann "null" als Nachricht benutzen
        if (lieblingsfarbe == null) {
            // "null" kann dafür stehen, dass es kein
            // Ergebnis gibt und die Klasse erst
            // initialisiert werden muss
            lieblingsfarbe = "Gelb";
        }
        /*
        Zum Beispiel:
        In einer Benutzeroberfläche hat ein Benutzer
        in ein Feld nichts eingetragen.
        Dann wäre der Wert der Referenzen auf diese
        Felder "null".
        Dies dient auch als Nachricht, dass *nichts*
        eingetragen worden ist.

        Zum Beispiel beim Alter:
        "0 Jahre" <- 0
        "" <- nichts / null

        null: Das Objekt existiert (noch) nicht!
         */

        // Konstruktor
        // Wann braucht es diesen?
        System.out.println(wuffi.fellfarbe); // null
        wuffi.fellfarbe = "Blond"; // wir müssen manuell initialisieren
        System.out.println(wuffi.fellfarbe); // Blond

        // Wir wollen aber bei Katzen, dass jede
        // Katze garantiert eine (initialisierte) Fellfarbe hat
        Katze miau = new Katze("Braun");
        System.out.println(miau.fellfarbe);

        Hase normalerHase = new Hase();
        System.out.println(normalerHase.fellfarbe); // Braun

        Hase schneehase = new Hase("weiß");
        System.out.println(schneehase.fellfarbe); // weiß

        // Welche Parameter muss man ihm übergeben?
        //     Immer jene Parameter, die wir zur Initialisierung
        //     eines Objekts benötigen.

        // this-Referenzen, wann kommen sie ins Spiel?

        /*
        Im Konstruktor:
            Das Objekt welches gerade erstellt wird, wird
            mit "this" referenziert.

        In einer Methode:
            Jenes Objekt welches diese Methode aufruft ist
            in der Referenz "this" hinterlegt.
         */

        boolean gleich = schneehase.equals(normalerHase);
        System.out.println(gleich); // false

        // this kann benutzt werden um Aufrufe in mehreren
        // Zeilen auf eine Zeile abzukürzen.
        // Dazu muss der return-Wert der Methoden eine
        // this-Referenz sein.
        schneehase.fuettere(3).esse(5);

        // Auch neue Objekte desselben Typs / derselben Klasse
        // können als Rückgabewert so benutzt werden:
        Hase sh_kind = schneehase.vermehre().fuettere(4);

        // Getter und Setter
        Schildkroete schildi = new Schildkroete();

        // Das Attribut "panzerfarbe" ist private,
        // wir können also von außerhalb der Klasse
        // nicht auf das Attribut zugreifen:
        // schildi.panzerfarbe; <- error

        Hamster schnucki = new Hamster("Blau"); // "Blau" ist nicht erlaubt
        // Das Attribut "fellfarbe" ist wieder "private"
        // das heißt: Wir können hier nicht darauf zugreifen

        // schnucki.fellfarbe; <- Error!

        // Um also die Fellfarbe herauszufinden, brauchen
        // wir einen Getter!
        String schnuckisFellfarbe = schnucki.getFellfarbe();
        System.out.println("Sommerfell: " + schnuckisFellfarbe); // "Braun"

        // Wir können durch das "private" auch keinen neuen Wert
        // für die Fellfarbe setzen: Wir brauchen also einen Setter!
        schnucki.setFellfarbe("Weiß");
        String schnuckisWinterfell = schnucki.getFellfarbe();
        System.out.println("Winterfell: " + schnuckisWinterfell); // "Weiß"

        // Mehrdimensionale Arrays
        char[][] charChars = new char[][]{{' ','x',' '},{' ','x',' '},{' ','x',' '}};

        System.out.println("\nAusgabe der Arrays:");
        for (char[] chars : charChars) {
            String arr = Arrays.toString(chars);
            System.out.println(arr);
        }

        // Wir können Schleifen verschachteln
        System.out.println("\nNur Zeichen:");
        for (char[] chars : charChars) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.print('\n');
        }

        // Die verschachtelten Schleifen können auch indiziert werden
        System.out.println("\nInvertieren der Matrix:");
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                char c = charChars[y][x];
                System.out.print(c);
            }
            System.out.println('\n');
        }

        // Matrix mit ungleichen Zeilen / Spalten
        int[][] nullNulls = new int[3][4];

        for (int[] nulls : nullNulls) {
            String ns = Arrays.toString(nulls);
            System.out.println(ns);
        }

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 3; y++) {
                // Ohne Zeilenumbruch
                System.out.print(
                        nullNulls[y][x]
                );
            }
            // Zeilenumbruch
            System.out.println("\n");
        }
    }
}
