package edu.campus02;

public class Rechteck {
    int laenge = 0;
    int breite = 0;

    public int flaeche() {
        return laenge*breite;
    }

    public boolean equals(Rechteck anderesRechteck) {
        boolean ergebnis; // Deklarieren der Variable
        ergebnis = laenge == anderesRechteck.laenge
                && breite == anderesRechteck.breite;
        return ergebnis;
    }
}
