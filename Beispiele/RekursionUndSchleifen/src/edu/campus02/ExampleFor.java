package edu.campus02;

public class ExampleFor {
    public static void main(String[] args) {

        System.out.println(summe(1,10));
        System.out.println(halbeSumme(1,10));
        System.out.println(bruchSumme(2,10));
        // Berechnen der Summe der Zahlen 1/𝑖  | 𝑖∈[2,10]
    }

    public static double bruchSumme(int von, int bis) {
        double erg = 0;

        for ( int i = von; i <= bis; i++) {
            // Bei der Division zweier Ganzzahlen
            // ist das Ergebnis selbst eine Ganzzahl
            // Deshalb vorher Typumwandlung auf double!

            // Deshalb gibt es den Modulo-Operator %
            // int a = 7;
            // int b = 3;
            // int ergb = a / b; // == 2
            // int rest = a % b; // == 1
            // ergb * b + rest == a // True!

            erg += 1.0/((double)i);
        }

        return erg;
    }

    public static double halbeSumme(int von, int bis) {
        double erg = 0;

        for ( int i = von; i <= bis; i++) {
            erg += i/2.0;
        }

        return erg;
    }

    public static int summe(int von, int bis) {
        int erg = 0;
        //        am Anfang     |   jede Iteration  | am Ende jeder Iteration
        for (   int i = von;          i <= bis;            i++) {
            erg += i;
        }
        // äquivalent zu:
        /*
        int i = von; // <- am Anfang
        while (i <= bis) { // <- jede Iteration: Überprüfung
            erg += i; // <- Ausgeführt

            i++; // am Ende jeder Iteration: Inkrement
        }
         */
        return erg;
    }

    public static int summe10() {
        int erg = 0;
        for (int i = 1; i <= 10; i++) {
            erg += i;
        }
        return erg;
    }
}
