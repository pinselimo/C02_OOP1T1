package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean dieSonneScheint;
        boolean esRegnet;

        dieSonneScheint = true;
        esRegnet = false;

        boolean ergebnis;
        ergebnis = dieSonneScheint && esRegnet;

        // Als Abkürzung um System.out.println zu schreiben kann man in
        // IntelliJ IDEA auch "sout" schreiben und die Tabulator-Taste drücken
        System.out.println("Die Sonne scheint UND es regnet: " + ergebnis);

        // Das Beispiel verwirrt mich ODER Ich kenne mich aus
        boolean ichBinVerwirrt;
        boolean ichKenneMichAus;

        ichBinVerwirrt = false;
        ichKenneMichAus = true;

        boolean ergebnis2;
        ergebnis2 = ichBinVerwirrt || ichKenneMichAus;

        System.out.println("Bin ich verwirrt oder kenne ich mich aus? " + ergebnis2);

        // Bsp 3: (1 > 3 UND NICHT (3-1 < 5)) ODER 2 == 4*4
        //        (1 > 3 &&  ! (3-1 < 5)) || 2 == 4*4

        boolean teil1;
        boolean teil2;
        boolean ergebnis3;

        teil2 = 2 == 4*4;
        teil1 = 1 > 3 && !(3-1 < 5);

        ergebnis3 = teil1 || teil2;

        ergebnis3 = (1 > 3 && !(3-1 < 5)) || 2 == 4*4;

        System.out.println("Ergebnis 3: " + ergebnis3);

        // Bsp 4: (6 >= 2*3 || 2-3 < 0) && (1*1 == 1 && 1 != 1+1)
        teil1 = 6 >= 2*3 || 2-3 < 0;
        teil2 = 1*1 == 1 && 1 != 1+1;

        boolean ergebnis4 = teil1 && teil2;

        System.out.println("Ergebnis 4: " + ergebnis4);

    }
}
