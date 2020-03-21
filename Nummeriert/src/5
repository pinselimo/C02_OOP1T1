package edu.campus02;

public class Main {

    public static void main(String[] args) {
        
        int nettoPreis = 200;
        int steuerklasse = 1;
        System.out.println("Netto: "+nettoPreis);

        double steuer1 = 0.2;
        double steuer2 = 0.16;
        double steuer3 = 0.08;
        double steuer = 0;
        double brutto;

        if (nettoPreis > 200) {
            steuer = nettoPreis*steuer1;
        } else if ( nettoPreis <= 200 && nettoPreis > 100 ) {
            steuer = nettoPreis*steuer2;
        } else {
            steuer = nettoPreis*steuer3;
        }

        double bruttoPreis = nettoPreis + steuer;
        System.out.println("Brutto: "+bruttoPreis);
    }
}