package edu.campus02;

/*
Die Klasse Hase hat 2 Konstruktoren

 */
public class Hase {
    // Bei den Attributen sind nur
    // Deklaration und Initialisierung
    // möglich
    public String fellfarbe;
    public int futterstand;

    public Hase() {
        fellfarbe = "Braun";
        futterstand = 0;
        // Im Konstruktor wird der Code beim erstellen
        // eines neuen Objekts der Klasse ausgeführt

        // Man kann hier Methoden aufrufen
        // Schleifen und if-Abfragen und alles
        // andere normal Benutzen
    }

    public Hase(String fellfarbe) {
        // Der Parameter "fellfarbe" verdeckt das
        // Attribut. Mit "this" weisen wir explizit
        // auf das Attribut mit demselben Namen hin!
        this.fellfarbe = fellfarbe;
        futterstand = 0;
    }

    public Hase(String fellfarbe, int futterstand) {
        this.fellfarbe = fellfarbe;
        this.futterstand = futterstand;
    }

    public boolean equals(Hase andererHase) {
        // Mit "this" verweist man auf das *eigene* Attribut
        String meineFellfarbe = this.fellfarbe;
        // "other" ist in dem Fall ein Parameter, eine
        // Referenzvariable auf irgendein Objekt der Klasse
        // "Hase"
        String andereFellfarbe = andererHase.fellfarbe;
        boolean gleicheFellfarbe = meineFellfarbe.equals(andereFellfarbe);

        return gleicheFellfarbe;
    }

    public Hase fuettere(int futter) {
        this.futterstand += futter;
        return this;
    }

    public void esse(int futter) {
        this.futterstand -= futter;
    }

    public Hase vermehre() {
        String fellfarbe_kind = this.fellfarbe;
        Hase kind = new Hase(fellfarbe_kind);
        return kind;
        // Oder ganz kurz:
        // return new Hase(this.fellfarbe);
    }
}
