package edu.campus02;

import java.util.Arrays;

public class ArrayLoops {
    public static void main(String[] args) {

        /*
        Zur Erklärung wie man Arrays mit Schleifen verbindet:

        Wir erstellen ein array mit den Werten (in dieser Reihenfolge) 65, 4, 3, 22
        Jeder dieser Werte hat im Array einen *Index* welcher uns
        auf diesen Wert zugreifen lässt. Beim ersten Wert 65 ist
        dieser Index 0, beim zweiten 1 und so weiter.
        Der letzte Wert eines Arrays hat immer den Index array.length-1
        Wobei im Attribut array.length die Länge des Arrays hinterlegt ist.
        In unserem Fall ist die Länge 4, und daher der Index der letzten
        Zahl 22 im Array gleich 4-1 = 3!
        */
        int[] array = new int[] {65,4,3,22};

        int erstes = array[0]; // 65
        int zweites = array[1]; // 4
        int drittes = array[2]; // 3
        int viertes = array[3]; // 22
        // array.length == 4;

        /*
        Statt nun manuell auf jedes Element mit dem jeweiligen Index zuzugreifen,
        können wir eine Schleife machen und die Laufvariable über alle im Array
        verfügbaren Indizes laufen lassen.
        Treffend nennen wir auch die Laufvariable in der folgenden For-Schleife
        "index".

        Die Regeln für die Indizierung in Arrays helfen uns hierbei:
        Das erste Element hat immer den Index 0 und alle weiteren folgen darauf
        inkrementell; Der Index erhöht sich also immer um eins, bis zum letzten
        Wert welcher immer array.length-1 als Index hat. 
        Somit kann unsere For-Schleife von:
            int index = 0; 
        Bis zu:
            index < array.length;
        Laufen, mit:
            index++;
        */

        // Dieser For-Loop geht über die Indizes aller Elemente im Array
        for (int index = 0; index < array.length; index++) {
            System.out.println(
                    "Index: " + index + " : " + array[index]
            );
            // Zuweisung vom vorherigen Wert mal Drei auf die selbe Stelle
            array[index] = array[index]*3;
        }
        // Mit Arrays.toString lässt sich ein Array (egal welchen Typs) in einen String verwandeln:
        System.out.println(Arrays.toString(array));

        /*
        Da diese Regeln für *alle* Arrays gelten, lassen sich zwei Arrays
        einfach in einer Schleife kombinieren. Man kann somit in einem 
        Array die Ausgangswerte speichern, und in einem weiteren die 
        Ergebnisse. Wichtig ist nur, dass sie die passende Länge haben!

        Geht also unser index von 0 bis 3, so kann er auch in einem zweiten
        Array mit der Länge 4 die dortigen Werte ansprechen und lesen oder 
        beschreiben:

            array_ergebnisse[index] = array_ausgangswerte[index] * 3;

        Natürlich lässt sich auch im selben array aus welchem gelesen wird
        wieder schreiben:

            array_ausgangswerte[index] = array_ausgangswerte[index] * 3;

        */

        // Beispiel 1
        // Um alle Werte des Arrays aufzusummieren,
        // kann man eine Variable "summe" schaffen
        // und dann mit dem Index über alle Werte
        // gehen und sie zu Summe (Ausgangswert: 0)
        // addieren.
        int[] feld1 = new int[] {2,4,5,7};
        int summe = 0;
        for (int index = 0; index < feld1.length; index++) {
            summe += feld1[index];
        }

        // For-Each
        // Mit einer For-Each Schleife lässt sich
        // die Summe bilden ohne ein Laufvariable
        // bilden zu müssen.
        // 
        // Die For-Each Schleife funktioniert wie folgt:
        // Wir bilden eine Variable "zahl"
        // welche nacheinander die Werte welche
        // sich im Array befinden annimmt.
        summe = 0;
        for (int zahl : feld1) {
            summe += zahl;
        }

        // Beispiel 2
        // Um die dreifachen Werte der Werte in einem
        // Array "feld1" zu berechnen und zu speichern
        // initialisieren wir ein zweites Array "feld2"
        // mit der gleichen Länge wie feld1 (new int[feld1.length])
        // Beide Arrays haben somit auch die selben Indizes!
        // 
        // Um die Werte einfach mit ihrem dreifachen zu *überschreiben*
        // kann man links und rechts der Zuweisung auch jeweils "feld1"
        // referenzieren. Mit einem zweiten Array (feld2) kann man die 
        // Werte im Array feld1 unverändert belassen.
        int[] feld2 = new int[feld1.length];
        for (int i = 0; i < feld1.length; i++) {
            feld2[i] = feld1[i]*3;
        }
        // Mit einer For-Each Schleife werden die Werte im Array ausgegeben:
        for (int zahl : feld2) {
            System.out.println(zahl);
        }

        // For Each
        // Die For-Each Schleife initialisiert
        // die Variable "zahl" in jedem Durchgang
        // neu und setzt sie auf die Werte im Array!
        //
        // Deshalb lassen sich mit der For-Each Schleife
        // Werte im Array nur *lesen* nicht aber überschreiben!
        feld1 = new int[] {1,2,3,4};
        for (int zahl : feld1) {
            System.out.println(zahl*3);
        }

        /*
        Arrays und Schleifen lassen sich auch in Methoden verwenden.
        Um Arrays in Methoden zu benutzen muss nur auf die richtige
        Typ-Signatur geachtet werden. Gibt eine Methode ein Array
        aus Ganzzahlen zurück, ist ihr Typ entsprechend int[] und
        nicht int. Auch bei den Parametern muss spezifiziert sein
        ob es sich um ein Array handelt. zB: "String[] args" in der
        main-Methode.
        */
        // Teste Beispiel 3.1
        int sum = summe(feld1);
        System.out.println(sum);

        // Teste Beispiel 3.2
        int[] feld3 = dreifaches(feld1);
        for (int zahl : feld3) {
            System.out.println(zahl);
        }

        // Beispiel 4
        // Zur Erklärung siehe Blockkommentar in Zweile 170!
        int[] feld4 = new int[] {2,4,2,5,6,9};
        int[] ergebnisFeld = new int[ feld4.length/2 ];

        for (int i = 0; i < feld4.length/2; i++) {
            ergebnisFeld[i] = feld4[2*i] + feld4[2*i+1];
        }
        // Mit Arrays.toString lässt sich ein Array (egal welchen Typs) in einen String verwandeln:
        System.out.println(Arrays.toString(ergebnisFeld)); 

        // Teste Beispiel 5
        ergebnisFeld = nachbarn(feld4);
        System.out.println(Arrays.toString(ergebnisFeld));


        /*
        Im letzten Beispiel ist die Anzahl der Ergebniswerte nur halb
        so groß wie die Anzahl der Ausgangswerte (6).
        Deshalb reicht es, ein Array mit der Länge 3 zu benutzen um die
        Ergebnisse zu speichern. Das stellt uns aber vor das Problem,
        dass wir gleichzeitig mit zwei unterschiedlich langen Arrays
        arbeiten und in beiden auf die Werte zum lesen/schreiben zugreifen
        wollen.

        Dies kann man (wie so oft auf verschiedene Weisen) lösen. Zuerst
        dazu wie ich es gemacht habe:

            1. Ich beziehe meine Laufvariable "i" auf die Indizes im ergebnis-Array.
            Dieses hat Länge 3, ergo ist "i" zuerst 0 und wird dann inkrementell
            bis auf 2 erhöht.
            Nun möchte ich die Werte mit folgenden Indizes addieren:
                Bei (i = 0) sollen array[0] und array[1] addiert werden
                Bei (i = 1) sollen array[2] und array[3] addiert werden
                Bei (i = 2) sollen array[4] und array[5] addiert werden
            Das Problem bildet also eine mathematische Folge.
            Wir sehen, dass die ersten Indizes immer mit 2 * i gebildet werden können.
            Als nächstes sehen wir, dass die zweiten Indizes immer der jeweils erste +1 sind.
            Also können wir für die zweiten Indizes schreiben: 2*i + 1
            Daraus folgt:
                ergebnis[i] = array[ 2 * i ] + array[ 2*i + 1 ];


            2. Zu einer alternativen Lösnugsvariante. Wir können natürlich auch vom Array
            mit den Ausgangswerten ausgehen. Dieses hat die Länge 6, ergo wird unsere Laufvariable
            Werte zwischen 0 und 5 annehmen.
            Sehen wir uns zuerst an, welche Felder addiert werden sollen:
                array[ 0 ] + array[ 1 ]
                array[ 2 ] + array[ 3 ]
                array[ 4 ] + array[ 5 ]
            Wir sehen dass die Laufvariable also entweder die Werte 0,2,4 oder die Werte 1,3,5 
            annehmen muss. Ergo können zwei For-Schleifen entstehen. Für die Werte 0,2,4:
                for ( int i = 0; i < array.length-1; i+=2 ) {}
            oder für die Werte 1,3,5:
                for ( int i = 1; i < array.length; i+=2 ) {}
            Wie speichern wir nun in ein Array der Länge 3?
            Unser Index für dieses Array muss konsequenterweise die Werte 0,1,2 annehmen.
            Im ersten Fall ist er damit also immer i/2.
            Im zweiten Fall ergibt sich (i-1)/2.
            Wir sehen also, dass wir quasi das "umgekehrte" Beispiel zur Lösung 1 gefunden haben.
        */
    }

    // Beispiel 3 ("Ergebnis" als Summe interpretiert)
    public static int summe(int[] array) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        return summe;
    }

    // Beispiel 3 ("Ergebnis" interpretiert als das jeweils Dreifache)
    public static int[] dreifaches(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // array[i] = array[i] * 3;
            array[i] *= 3;
        }
        return array;
    }

    // Beispiel 5
    // Erklärung zu finden im Blockkommentar Zeile 170!
    public static int[] nachbarn(int[] array) {
        int[] ergebnisFeld = new int[ array.length/2 ];

        for (int i = 0; i < array.length/2; i++) {
            ergebnisFeld[i] = array[2*i] + array[2*i+1];
        }

        return ergebnisFeld;
    }
}
