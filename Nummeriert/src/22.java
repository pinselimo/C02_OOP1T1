package edu.campus02;

public class Quader {
    // Jeder Quader soll drei Attribute haben
    // sie alle werden mit Typ und Namen deklariert
    // wahlweise kann ihnen auch bereits ein Wert
    // zugewiesen werden. Jedoch
    int breite;
    int hoehe;
    int laenge;

    public int oberfläche() {
        int bodenUndDecke = grundflaeche()*2;
        int seiten = 2*hoehe*laenge + 2*hoehe*breite;

        return seiten + bodenUndDecke;
    }

    public int querschnitt(final String achse) {
        int ergebnis = 0;
        switch (achse) {
            case "X":
                ergebnis = hoehe*breite;
                break;
            case "Y":
                ergebnis = hoehe*laenge;
                break;
            case "Z":
                ergebnis = laenge*breite;
                break;
        }
        return ergebnis;
    }

    public int volumen() {
        return grundflaeche()*hoehe;
    }

    public int grundflaeche() {
        return breite*laenge;
    }

    public void skaliere(int faktor) {
        breite *= faktor;
        hoehe *= faktor;
        laenge *= faktor;
    }

    public void setzeHoehe(int neueHoehe) {
        hoehe = neueHoehe;
    }
}
