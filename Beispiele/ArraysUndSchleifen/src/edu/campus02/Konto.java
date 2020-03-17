package edu.campus02;

public class Konto {
    public static void main(String[] args) {
        /* Unsere Methode "konto" nimmt eine Anzahl von
        Jahren, eine Einlage (in Euro) und einen Zinssatz
        als Parameter entgegen:
        */
        konto(10 /*jahre*/,2000 /*Euro*/,0.025 /*Zinssatz*/);
    }

    public static void konto(int jahre, double einlage, double zinssatz) {
        // Um den Code leserlicher zu machen benennen wir die Einlage in "kontostand" um
        double kontostand = einlage;
        // Dann machen wir eine Schleife, welche so viele Wiederholungen ausübt,
        // wie wir Jahre vorgegeben haben.
        // In diesem Fall brauchen wir die Laufvariable nicht in der Schleife selbst
        // verwenden. Es muss sie aber dennoch geben! Sie zählt nämlich die Jahre mit
        // und ermöglicht es uns somit, die Schleife zum richtigen Zeitpunkt zu beenden!
        for ( int i = 0; i < jahre; i++) {
            // In jedem "Jahr" geben wir den Kontostand in der Konsole aus
            System.out.println(kontostand);
            // Dann erhöht er sich um den Zinssatz
            kontostand += kontostand*zinssatz;
        }
        // Zuletzt geben wir den Kontostand noch einmal aus
        System.out.println(kontostand);
    }
}
