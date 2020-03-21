package edu.campus02;

public class Tamagochi {
    int xKoordinate;
    int yKoordinate;
    int futterstand;

    public Tamagochi(int x, int y, int f) {
        System.out.println("Bewege mich zu X=0, Y=0!");
        this.xKoordinate = x;
        this.yKoordinate = y;
        this.futterstand = f;
    }

    public void fuettere(int futterAnzahl) {
        if (futterAnzahl > 100 || futterAnzahl < 1) {
            return;
        } else {
            this.futterstand += futterAnzahl;
        }
    }

    /*
        Löse auch als While-Schleife
     */

    public void gehe(String richtung, int schritte) {
        if ( schritte > this.futterstand) {
            schritte = this.futterstand;
        }
        /*
        else {
            fuettere(5);
            gehe(richtung, schritte);
        }
        */

        switch (richtung) {
            case "links":
                this.xKoordinate -= schritte;
                break;
            case "rechts":
                this.xKoordinate += schritte;
                break;
            case "unten":
                this.yKoordinate -= schritte;
                break;
            case "oben":
                this.yKoordinate += schritte;
                break;
            default:
                System.out.println("Achtung: Richtung nicht erkannt!");
                System.out.println("Optionen: links, rechts, unten, oben");
                return;
        }
        this.futterstand -= schritte;
        System.out.println("X-Koordinate: " + this.xKoordinate +
                "; Y-Koordinate: " + this.yKoordinate +
                "; Futterstand: " + this.futterstand
        );
    }
}
