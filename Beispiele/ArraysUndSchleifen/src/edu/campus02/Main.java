package edu.campus02;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        Beim Betrachten des Java-Beispiels für 99-bottles-of-beer.net
        sind wir über eine kombinierte und äußerst kurze Variante für
        Zuweisung + If-Else-Abfrage gestolpert.
        Hier folgt die Erklärung:
        */
        // Ausdrucksstarke Variante
        //
        // Die Situation dass eine Variable abhängig von einer gewissen
        // Kondition unterschiedliche Werte zugewiesen bekommen soll
        // kommt häufig vor. 
        // So sieht die ausdrucksstarke Variante aus:
        String s = "s";
        int a = 2;
        if (--a == 1) {
            s = "";
        } else {
            s = "s";
        }

        // Kurze Variante
        // Diese sieben Zeilen lassen sich auch in einer einzigen (!)
        // Ausdrücken:
        s = --a == 1 ? "" : "s";
        // Man liest diese Zeile wie folgt:
        // "s" ist gleich "" falls (--a == 1) sonst "s"
        //
        // Das Fragezeichen verdeutlicht also, dass die *davor*stehende 
        // Bedingung erfüllt sein muss, damit das was direkt danach steht 
        // zugewiesen wird, ansonsten wird der Wert nach dem Doppelpunkt
        // zugewiesen.

        // Aufruf der Methode summe um die Summe der Zahlen von 3 bis 10 zu bilden:
        // summe(3,10);

        // Aufruf der Methode count:
        // count();

        // Aufruf der Methode whileBottles welche mittels while-Schleife den Text
        // des Liedes 99 Bottles of Beer ausgibt:
        // (mit Parameter für die initiale Anzahl der Flaschen)
        whileBottles(5);


        /*
        Zur Erklärung wie man Arrays mit Schleifen verbindet:

        Wir erstellen ein array der Länge 63! 
        Jeder Wert im Array hat einen *Index* welcher uns
        auf diesen Wert zugreifen lässt. Beim ersten Wert ist
        dieser Index 0, beim zweiten 1 und so weiter.
        Der letzte Wert eines Arrays hat immer den Index array.length-1
        Wobei im Attribut array.length die Länge des Arrays hinterlegt ist.
        In unserem Fall ist die Länge 63, und daher der letzte Index
        im Array gleich 63-1 = 62!
        */
        int[] array = new int[63];
        // Mit der Methode quadrate lassen sich die Werte 0 bis zur Länge des
        // Arrays minus Eins quadrieren und im der Methode übergebenen Array
        // abspeichern.
        quadrate(array);
        // array[0] = 0*0;
        // array[1] = 1*1;
        // ...
        // array[62] = 62*62;

        // Mit Arrays.toString lässt sich ein Array (egal welchen Typs) in einen String verwandeln:
        System.out.println("Array: "+ Arrays.toString(array));
        // Mit printArray haben wir eine Methode gebastelt, welche eine äquivalente Ausgabe zu
        // Arrays.toString liefert:
        printArray(array);

        // Die Methode machPinguine erzeugt ein String-Array mit einer zuvor spezifizierten
        // Anzahl an gleichen Einträgen "Ein Pinguin liest Zeitung, da steht:"
        String[] pings = machPinguine(10);
        // Die Methode forEachPinguin nimmt ein String-Array als Parameter entgegen
        // und schreibt jedes einzelne String-Element im Array in eine neue Zeile
        // der Konsole
        forEachPinguin(pings);
    }

    public static String[] machPinguine(int anzahl) {
        // Die Methode machPinguine erzeugt ein String-Array mit einer zuvor spezifizierten
        // Anzahl an gleichen Einträgen "Ein Pinguin liest Zeitung, da steht:"
        String[] pinguinos = new String[anzahl];
        for (int index = 0; index < pinguinos.length; index++) {
            pinguinos[index] = "Ein Pinguin liest Zeitung, da steht:";
        }
        return pinguinos;
    }

    public static void forEachPinguin(String[] pinguinos) {
        // Die Methode forEachPinguin nimmt ein String-Array als Parameter entgegen
        // und schreibt jedes einzelne String-Element im Array in eine neue Zeile
        // der Konsole
        for (String pinguin: pinguinos) {
            System.out.println(pinguin);
        }
    }

    public static void printArray(int[] array) {
        // Mit printArray haben wir eine Methode gebastelt, welche eine äquivalente Ausgabe zu
        // Arrays.toString liefert

        // Zuerst muss eine eckige Klammer geöffnet werde:
        System.out.print("[");
        // Statt println haben wir die Methode "print" benutzt,
        // diese macht keinen Zeilenumbruch am Ende der Ausgabe

        // for-each Schleife
        // for ELEMENT in ARRAY

        // den Doppelpunkt kann man als "in" lesen
        for (int elem : array) {
            // Wiederum benutzen wir "print" und nicht "println" 
            System.out.print(elem+", ");
        }
        // Hier benutzen wir zwar ebenfalls "print", wir fügen aber 
        // mit dem Spezial-Zeichen '\n' einen Zeilenumbruch hinzu.
        // Weitere Spezial-Zeichen sind zB '\t' für einen Tabulator
        // oder '\r' um den Cursor wieder an den Anfang einer Zeile
        // zu stellen und alles weitere zu überschreiben. 
        System.out.print("]\n");
    }

    public static int[] quadrate(int[] array) {
        // Mit der Methode quadrate lassen sich die Werte 0 bis zur Länge des
        // Arrays minus Eins quadrieren und im der Methode übergebenen Array
        // abspeichern.
        for (int index = 0; index < array.length ; index++) {
            // Da wir auf die einzelnen Werte im Array zugreifen
            // verändern wir diese!
            array[index] = index*index;
        }
        // Wir könnten "quadrate" auch zu einer void-Methode machen
        // und das Array nicht zurückgeben, trotzdem würden sich die
        // Werte im Array welches überreicht wurde ändern!
        return array;
    }

    public static void whileBottles(int flaschen) {
        /*
        Die Methode "whileBottles" kann den Text des Liedes
        99 Bottles of Beer ausgeben. Startet dabei aber von
        einer beliebigen Anzahl an Bierflaschen am Regal
        festgelegt durch den Parameter "flaschen"
        */
        // Zuerst brauchen wir unsere Textbausteine:
        String s = "s "; // Die Variable "s" hilft uns zwischen Plural und Singular zu wechseln
        String text1 = " bottle";
        String text2 = " of beer on the wall ";
        String text3 = " of beer";
        String text4 = "Take one off, pass it around ";

        // Solange noch Bierflaschen am Regal sind,
        // produzieren wir die Standard-Strophen
        while (flaschen >= 1) {
            System.out.print(flaschen + text1 + s + text2);
            System.out.println(flaschen + text1 + s + text3);
            // Nach den ersten Zeilen ändert sich bereits die Anzahl
            // der Bierflaschen, da ja eine vom Regal genommen wird:
            flaschen--;

            // Wir überprüfen auch gleich, ob wir nun Singular brauchen
            // oder nicht:
            if (flaschen == 1)
                s = " ";
            else
                s = "s";
            // oder kurz formuliert:
            // s = flaschen == 1 ? "" : "s";

            // Dann fahren wir mit dem Rest der Strophe fort:
            System.out.println(text4 + flaschen + text1 + s + text2);
        }
        // Wenn die While-Schleife beendet ist, können wir garantieren, dass der
        // Wert für "Flaschen" 0 oder kleiner ist. 
        // Wir geben also die restlichen Zeilen des Liedes aus:
        // flaschen <= 0 !
        System.out.println("No more bottles of beer on the wall, no more bottles of beer");
        System.out.println("Go to the store, by some more, 99 bottles of beer on the wall");
        // Beachte: Wird die Methode mit einer negativen Anzahl an Flaschen gestartet
        //          gibt sie einfach diese zwei Zeilen aus. Es gibt keine Bierflaschen
        //          aus Antimaterie für unsere Methode!
    }

    public static void count() {
        // Die Methode count zählt vom Wert
        // in der Variable "von" bis zum Wert
        // der Variable "bis"
        int von = 99;
        int bis = 90;
        // Dazu benutzen wir eine While-Schleife
        // Wichtige Elemente der While-Schleife (ähnlich der Rekursion, siehe unten):

        // Abbruchbedingung: (von >= bis)
        while (von >= bis) {
            System.out.println(von);
            // Dekrement (oder inkrement, je nach Bedingung)
            von = von-1;
        }
    }

    public static int summe(int von, int bis) {
        // Diese Methode bildet rekursiv die Summe aller Zahlen
        // zwischen (inklusive) der Parameter von - bis.

        // Wichtige Elemente einer rekursiven Funktion:
        // Die Abbruchbedingung: von >= bis
        if (von >= bis) {
            return von;
        } else {
            //               das Inkrement von++
            return von + summe(von++, bis); // und der rekursive Aufruf der Methode selbst summe(von++, bis)
        }

        /*
        Wie funktioniert's?

        Die Methode summe rechnet den Paramter "von" *plus*
        das Ergebnis der Methode summe mit neuen Parametern:
            "von" wird um eins erhöht, "bis" bleibt gleich
        Erreich der Parameter "von" den Wert von "bis", wird 
        nicht mehr das Ergebnis der Methode summe dazu-addiert
        sondern nur noch der Wert des Parameters "von" zurückgegeben.

        Somit ergibt sich: von + von+1 + von+1+1 + von+1+1+1 .... + bis
        */
    }
}
