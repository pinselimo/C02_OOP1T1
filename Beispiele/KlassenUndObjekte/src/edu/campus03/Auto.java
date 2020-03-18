package edu.campus03;

public class Auto {
    // Um aus anderen Paketen auf die
    // Attribute zugreifen zu können
    // müssen sie als "public" deklariert
    // werden.
    public String name = "Charly";
    public static String marke = "Fiat";
    // motor ist nicht "public"
    // Es kann nur aus demselben Paket darauf
    // zugegriffen werden
    String motor = "Elektrisch";
    // Das Attribut "leistung" ist "private"
    // Nur innerhalb der Klasse selbst kann
    // auf dieses Attribut zugegriffen werden.
    private int leistung = 500; // kW
    // Die Qualifier "public" und "private"
    // sind auch für Methoden möglich
}
