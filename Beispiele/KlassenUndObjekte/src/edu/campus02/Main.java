package edu.campus02;

import java.awt.Point;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a; // Deklarieren einer normalen Variable
        a = 5;
        int b; // Deklarieren einer weiteren Variable
        b = 5;
        int c;
        c = a; // c bekommt denselben Wert wie a
        // Wenn wir c ändern, ändert sich a nicht

        boolean gleich = a == b; // true

        // Analog dazu, wird beim Vergleich von zwei
        // Referenzvariablen verglichen, ob sie den
        // gleichen *Wert* haben; Also, ob sie auf
        // dasselbe Objekt zeigen, nicht ob die Objekte
        // auf welche sie zeigen denselben *Inhalt* haben
        String sA; // Referenzvariable 1
        String sB; // Referenzvariable 2
        String sC; // Referenzvariable 3
        sA = "ABBA";
        sB = "ABBA";
        sC = sA; // wir übergeben die Referenz auf die sA zeigt auch an sC
        // Daher zeigt sC auf dasselbe Objekt wie sA!
        // Änderungen die wir an sC vornehmen, ändern das Objekt auf das
        // auch sA zeigt!

        /*
        Die Zeichenketten in sA und sB sind gleich
        Aber es sind zwei *unterschiedliche* Objekte
        welche nicht die gleiche Identität haben!
         */
        boolean equal = sA == sB; // false
        boolean binIchIch = sA == sA; // true
        boolean bistDuIch = sA == sC; // true
        boolean istGleich = sA.equals(sB); // true

        // Ich *bin* ein java.awt.Point -> Klassenname
        Point pt; // Deklarieren der Referenzvariable
        pt = new Point(); // Initialisieren eines Point-Objekts und speichern der Referenz auf der Referenzvariable "pt"
        // Ich *habe* eine x- und eine y-Koordinate -> Attribute
        pt.x = 5;
        pt.y = 3;
        // Ich *kann* mich bewegen -> Operation (in Java: "Methode")
        pt.move(4,6);

        // Dasselbe funktioniert auch mit der Klasse String
        // und String-Objekten
        String str; // Deklarieren einer Referenzvariable "str"
        str = new String(); // Initialisieren eines neuen String-Objekts
        // new String() bildet ein neues String Objekt.
        // Seine Zeichenkette ist leer:
        boolean istLeer = str.equals(""); // true
        System.out.println(istLeer);

        String testString; // Deklarieren einer Referenzvariable
        testString = "Zeichenkette"; // Strings lassen sich auch mit Anführungszeichen initialisieren (das ist ein Spezialfall für Strings!)

    }
}
