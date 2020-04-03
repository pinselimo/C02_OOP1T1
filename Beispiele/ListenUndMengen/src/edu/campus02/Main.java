package edu.campus02;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] städte = new String[] {"Wien","Berlin", "Hamburg","Berlin", "Warschau", "Prag"};

        // Wir machen aus dem Array eine Liste:
        List<String> städteListe = new LinkedList<>(Arrays.asList(städte));
        // Und auch eine Menge:
        Set<String> städteMenge = new HashSet<>(Arrays.asList(städte));

        System.out.println(städteListe.toString()); // in der Liste sind alle Elemente so wie im Array enthalten
        System.out.println(städteMenge.toString()); // in der Menge werden doppelte Elemente nicht zwei Mal angeführt

        // Beide Typen bieten ähliche Methoden (da sie ja in der Collections-API enthalten sind)
        boolean warenWirInParis = städteListe.contains("Paris");
        System.out.println("Waren wir in Paris? " + warenWirInParis);

        // Schnellerenhhh Zugriff für "contains" bietet die Menge
        boolean warenWirInLondon = städteMenge.contains("London");
        System.out.println("Waren wir in London? " + warenWirInLondon);

        // Iterator
        // Bei beiden Kollektionen lassen sich die einzelnen Elemente
        // auslesen; Mit dem Iterator:

        // Ist ein Objekt/eine Klasse eine Instanz von "Iterable",
        // hat sie also die Schnittstelle "Iterable" implementiert
        // so *muss* sie eine Methode "iterator()" haben, die einen
        // Iterator über diese Kollektion ausgibt.
        boolean habenListenIterator = städteListe instanceof Iterable;
        System.out.println("Listen haben Iterator: " + habenListenIterator);
        boolean habenMengenIterator = städteMenge instanceof Iterable;
        System.out.println("Mengen haben Iterator: " + habenMengenIterator);


        System.out.println("\nListe:");
        // Die Reihenfolge bleibt in der Liste erhalten:
        städteListe.add("London");
        städteListe.add("New York");
        städteListe.add("Moskau");
        städteListe.add("Kapstadt");


        Iterator<String> städteIterator = städteListe.iterator();
        while (städteIterator.hasNext()) {
            String nächsteStadt = städteIterator.next();
            System.out.println(nächsteStadt);
        }

        System.out.println("\nMenge:");
        // Bei Mengen wird ist die Reihenfolge nicht (so einfach) definiert:
        städteMenge.add("London");
        städteMenge.add("New York");
        städteMenge.add("Moskau");
        städteMenge.add("Kapstadt");

        Iterator<String> mengenIterator = städteMenge.iterator();
        while (mengenIterator.hasNext()) {
            String nächstesElement = mengenIterator.next();
            System.out.println(nächstesElement);
        }
    }
}
