package edu.campus02;

import java.util.Arrays;

public class LoopExample {
    public static void main(String[] args) {

        /*
        Einige Beispiele zu Schleifen. 
        */

        // Beispiel 2
        // Summiere alle 1/i für i in [2,100]
        // Wir speichern das Ergebnis in eine Variable "ergebnis"
        // Diese Variable initialisieren wir auf einen Wert 0.0
        double ergebnis = 0.0;
        for (int i = 2; i <= 100; i++) {
            // Achtung: Division von Double und Integer!
            // Dividieren wir zwei Integer (Ganzzahlen)
            // so ist das Ergebnis wiederum eine Ganzzahl.
            // Der Rest der Division wird dabei Verworfen!
            // 
            // 1 / 2 ist also gleich 0
            // genauso wie 1 / 100
            //
            // 1.0 / 2 ist aber 0.5
            // und 1.0 / 100 ergibt 0.01
            //
            // Es reicht also eine Zahl eine Double sein zu lassen.
            // Wichtig ist: Abhängig vom Typen der Operanden ändert
            //              sich das Ergebnis!
            ergebnis += 1.0/i; 
        }
        System.out.println(ergebnis);


        // Beispiel 3
        // Die Zahlenreihe 3,6,9,12 .. 9000 soll aufsummiert werden.
        // Wieder initialisieren wir eine Ergebnisvariable auf den Wert 0.
        // Da wir Ganzzahlen summieren, kann diese Variable "erg" auch
        // eine Ganzzahl sein.
        int erg = 0;
        // Auch größere Schritte als welche mit Abstand 1 lassen sich in
        // einer For-Schleife verwirklichen.
        // Wir benuten dazu den kombinierten Zuweisungs- und Additionsoperator: +=
        //   Beginn bei 3 ; Ende bei 9000 ; Schrittweite: 3
        for ( int i = 3   ;   i <= 9000   ;    i+=3         ) {
            erg += i;
        }
        System.out.println(erg);


        // Beispiel 4
        // Die Ziffernsumme einer Matrikelnummer bilden

        /* Hilfestellungen:
        Auch Zeichen in einem String haben einen Index,
        ähnlich wie bei einem Array aus Zeichen.
        Sie kann man mit der Methode ".chatAt" aus dem String
        herausholen:
            char ziffer1 = matrnr.charAt(0);

        Um die Zeichen zu summieren, müssen wir sie in Integer
        konvertieren. Dies können wir mittels expliziter Typ-
        Umwandlung bewerkstelligen. Hierzu müssen sie allerdings
        zuerst in Strings umgewandelt werden. Dies kann die 
        Character.toString(..) Methode:
            String z1 = Character.toString(ziffer1);

        Nun können wir mit Integer.valueOf(..) den Wert in eine
        Ganzzahl vom Typ int umwandeln:
            int zahl1 = Integer.valueOf(z1);

        Strings haben noch eine Eigenschaft die sie ähnlich zu 
        Arrays erscheinen lässt, nämlich eine Methode ".length()"
        welche die Länge des Strings enthält und uns somit Auffschluss
        darüber gibt, welchen Index das letzte Zeichen im String
        erhält:
            int length = matrnr.length();
        */

        // Wir deklarieren und initialisieren also einen String
        // welcher die Matrikelnummer enthält:
        String matrnr = "11214931";

        // Wiederum haben wir eine eigene Variable um das Ergebnis zu speichern
        erg = 0;
        for (int index = 0; index < matrnr.length(); index++) {
            // Wir holen eine Ziffer als Zeichen aus dem String matrnr
            char c = matrnr.charAt(index);
            // Wir wandeln das Zeichen in einen String um
            String s = Character.toString(c);
            // Wir wandeln den String in eine Ganzzahl (int) um
            int ziffer = Integer.valueOf(s);
            // Wir addieren diese Ziffer zur Summe
            erg += ziffer;
        }
        System.out.println(erg);

        // Da öfter gefragt wurde, warum da steht "..with Exit Code: 0"
        // So lässt sich ein anderer Statuscode ausgeben:
        System.exit(-1);
    }
}
