package edu.campus02;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Die Methode machPinguine erzeugt ein String-Array mit einer zuvor spezifizierten
        // Anzahl an gleichen Einträgen "Ein Pinguin liest Zeitung, da steht:"
        String[] pings = machPinguine(10);
        // Die Methode forEachPinguin nimmt ein String-Array als Parameter entgegen
        // und schreibt jedes einzelne String-Element im Array in eine neue Zeile
        // der Konsole
        forEachPinguin(pings);
        }
    
    public static String[] machPinguine(int anzahl) {
        // Die Methode machPinguine erzeugt ein String-Array mit einer zuvor spezifizierten
        // Anzahl an gleichen Einträgen "Ein Pinguin liest Zeitung, da steht:"
        String[] pinguinos = new String[anzahl];
        for (int index = 0; index < pinguinos.length; index++) {
            pinguinos[index] = "Ein Pinguin liest Zeitung, da steht:";
        }
        return pinguinos;
    }

    public static void forEachPinguin(String[] pinguinos) {
        // Die Methode forEachPinguin nimmt ein String-Array als Parameter entgegen
        // und schreibt jedes einzelne String-Element im Array in eine neue Zeile
        // der Konsole
        for (String pinguin: pinguinos) {
            System.out.println(pinguin);
        }
    }
}