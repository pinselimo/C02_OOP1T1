package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        whileBottles(99);
    }

    
    public static void whileBottles(int flaschen) {
        /*
        Die Methode "whileBottles" kann den Text des Liedes
        99 Bottles of Beer ausgeben. Startet dabei aber von
        einer beliebigen Anzahl an Bierflaschen am Regal
        festgelegt durch den Parameter "flaschen"
        */
        // Zuerst brauchen wir unsere Textbausteine:
        String s = "s "; // Die Variable "s" hilft uns zwischen Plural und Singular zu wechseln
        String text1 = " bottle";
        String text2 = " of beer on the wall ";
        String text3 = " of beer";
        String text4 = "Take one off, pass it around ";

        // Solange noch Bierflaschen am Regal sind,
        // produzieren wir die Standard-Strophen
        while (flaschen >= 1) {
            System.out.print(flaschen + text1 + s + text2);
            System.out.println(flaschen + text1 + s + text3);
            // Nach den ersten Zeilen ändert sich bereits die Anzahl
            // der Bierflaschen, da ja eine vom Regal genommen wird:
            flaschen--;

            // Wir überprüfen auch gleich, ob wir nun Singular brauchen
            // oder nicht:
            if (flaschen == 1)
                s = " ";
            else
                s = "s";
            // oder kurz formuliert:
            // s = flaschen == 1 ? "" : "s";

            // Dann fahren wir mit dem Rest der Strophe fort:
            System.out.println(text4 + flaschen + text1 + s + text2);
        }
        // Wenn die While-Schleife beendet ist, können wir garantieren, dass der
        // Wert für "Flaschen" 0 oder kleiner ist. 
        // Wir geben also die restlichen Zeilen des Liedes aus:
        // flaschen <= 0 !
        System.out.println("No more bottles of beer on the wall, no more bottles of beer");
        System.out.println("Go to the store, by some more, 99 bottles of beer on the wall");
        // Beachte: Wird die Methode mit einer negativen Anzahl an Flaschen gestartet
        //          gibt sie einfach diese zwei Zeilen aus. Es gibt keine Bierflaschen
        //          aus Antimaterie für unsere Methode!
    }
}