package edu.campus02;

public class QuaderApp {
    public static void main(String[] args) {
        Quader q1 = new Quader();
        Quader q2 = new Quader();
        q1.hoehe = 2;
        q2.hoehe = 2;
        q1.laenge = 4;
        q2.laenge = 4;
        q1.breite = 3;
        q2.breite = 3;

        int oberfl1 = q1.oberfläche();

        q1.skaliere(5);
        q2.skaliere(3);


        int oberfl2 = q1.oberfläche();

        System.out.println("Oberfl1: " + oberfl1);
        System.out.println("Oberfl2: " + oberfl2);

        Quader quader = new Quader();
        quader.hoehe = 3;
        quader.breite = 17;
        quader.laenge = 63;
        int volumen = quader.volumen();
        System.out.println("Volumen: " + volumen);

        int erg = quader.querschnitt("X");
        System.out.println(erg);


        // null
        Quader q3 = new Quader();
        String nameOfQ3 = q3.name;
        nameOfQ3.toLowerCase();
        System.out.println(q3.name);
    }
}
