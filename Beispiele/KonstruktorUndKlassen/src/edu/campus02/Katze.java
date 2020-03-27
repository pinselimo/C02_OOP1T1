package edu.campus02;

public class Katze {
    public String fellfarbe;

    // Dieser eine Konstruktor überschreibt
    // den Standardkonstruktor ohne Parameter
    public Katze(String konkrete_fellfarbe) {
        this.fellfarbe = konkrete_fellfarbe;
    }
}
