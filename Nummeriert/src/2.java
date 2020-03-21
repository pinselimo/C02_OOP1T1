public class BruttoNetto {
    public static void main(String[] args) {
        int nettoPreis;
        nettoPreis = 200;

        int teiler;
        teiler = 105;
        int rest = nettoPreis % teiler;

        double steuersatz;
        steuersatz = 0.05;

        double bruttoPreis;
        bruttoPreis = nettoPreis + nettoPreis * steuersatz;

        System.out.println("Ergebnis: " + bruttoPreis + " €");

        double maxSteuersatz = 0.04;
        float f = 0.9f;
        boolean zuHoch;
        zuHoch = steuersatz > maxSteuersatz;

        System.out.println("Zu hoch? " + zuHoch);
    }
}
