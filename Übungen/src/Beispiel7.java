package edu.campus02;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1 /*startwert*/ ; i <= 100 /*endwert*/ ; i++) {
            if ( i%3 == 0 && i%5 == 0 ) {
                System.out.println("FizzBuzz");
            } else if ( i%3 == 0 ) {
                System.out.println("Fizz");
            } else if ( i%5 == 0 ) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // Bonusaufgaben
        // Test von Bonus 1:
        for ( int zahl = 1 /*startwert*/; zahl <= 100 /*endwert*/; zahl++ ) {
            String ergebnis = "";
            // Die Methode "zahlToString" gibt uns für eine Zahl
            // den richtigen FizzBuzz - String
            ergebnis = zahlToString(zahl);
            System.out.println(ergebnis);
        }
        // Test von Bonus 2:
        String[] ergebnis = fizzBuzzArray();
        System.out.println(Arrays.toString(ergebnis));

        // Test von Bonus 3:
        printStrings(ergebnis);

        // Bonus4: Das Ergebnis von FizzBuzz soll in der
        //         main-Methode ausgegeben werden.
        //         Es braucht nur noch eine Zeile!
        printStrings(fizzBuzzArray()); /* erstellt ein neues String[] mit den FizzBuzz-Werten*/
    }
    // Bonus 1
    // Methode die aus Zahl String macht
    public static String zahlToString(int zahl) {
        if ( zahl%3 == 0 /* durch Drei teilbar? */
                && zahl%5 == 0 /*UND auch durch Fünf teilbar?*/  ) {
            return "FizzBuzz";
        } else if ( zahl%3 == 0 /* durch Drei teilbar? */ ) {
            return "Fizz";
        } else if ( zahl%5 == 0 /* durch Fünf teilbar? */ ) {
            return "Buzz";
        } else {
            /* die Zahl ist weder durch 3 noch durch 5 teilbar! */
            String ergebnis = Integer.toString(zahl);
            return ergebnis;
        }
    }

    // Bonus 2
    // Mache eine Methode die das FizzBuzz-Ergebnis in einem
    // String-Array zurückgibt.
    // Benutze dazu die Methode "zahlToString"
    public static String[] fizzBuzzArray() {
        // Wir speichern das Ergebnis also in einem
        // String-Array mit der passenden Länge (100)
        String[] ergebnis = new String[100];

        // Wieder brauchen wir eine For-Schleife welche
        // über alle Werte für das FizzBuzz-Beispiel geht
        for ( int i = 0 /*startwert*/ ; i <= ergebnis.length-1 /*endwert*/ ; i++ ) {
            // Wir benutzen um herauszufinden was das korrekte
            // FizzBuzz-Ergebnis für die Zahl im Index ist
            // die Methode zahlToString!
            String fizzBuzzWert = zahlToString( i+1 );
            ergebnis[ i ] = fizzBuzzWert;
        }
        return ergebnis;
    }

    // Bonus 3
    // Eine Methode welche ein String-Array als Parameter
    // übernimmt und die darin enthaltenen Strings in
    // einzelnen Zeilen der Konsole ausgibt
    public static void printStrings(String[] strings) {
        /*
        Hier eignet sich eine For-Each Schleife!
        Da wir nur die einzelnen Elemente im Array "strings"
        auslesen wollen, sie aber nicht überschreiben oder
        verändern wollen, können wir mit der For-Each Schleife
        eine String-Variable "element" jeden Wert im Array
        "strings" annehmen lassen und somit jeden dieser Werte
        einzeln in der Konsole ausgeben.

        Da wir die Methode "println" benutzen, wird automatisch
        ein Zeilenumbruch nach jedem Element eingefügt.
         */
        for (String element : strings) {
            System.out.println(element);
        }
    }
}
