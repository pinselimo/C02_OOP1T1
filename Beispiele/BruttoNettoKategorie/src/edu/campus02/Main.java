package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nettoPreis = 200;
        /*int steuerklasse = 1;

        double steuer1 = 0.2;
        double steuer2 = 0.16;
        double steuer3 = 0.08;
        double steuer = 0;
        double brutto;

        if (nettoPreis > 200) {
            steuerklasse = 1;
        } else if ( nettoPreis <= 200 && nettoPreis > 100 ) {
            steuerklasse = 2;
        } else {
            steuerklasse = 3;
        }

        brutto = nettoPreis + steuer;
        System.out.println("Brutto: " + brutto);

        switch (steuerklasse) {
            case 1:
                steuer = nettoPreis*steuer1;
                break;
            case 2:
                steuer = nettoPreis*steuer2;
                break;
            case 3:
                steuer = nettoPreis*steuer3;
                break;
            default:
                System.out.println("Achtung, keine Steuerklasse!");
                break;
        }

        brutto = nettoPreis + steuer;
        System.out.println("Brutto: " + brutto);*/

        double brPreis;
        brPreis = bruttoPreis(nettoPreis, 0.04);
        System.out.println("Ergebnis der Methode: " + brPreis);
    }

    public static double bruttoPreis(int netto, double steuer) {
        double ergebnis;
        ergebnis = netto + netto*steuer;
        return ergebnis;
    }
}
