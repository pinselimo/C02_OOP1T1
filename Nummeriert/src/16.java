package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        doWhileBottles(99);
    }

    public static void doWhileBottles(int flaschen) {
        String text1 = " bottles of beer on the wall ";
        String text2 = " bottles of beer";
        String text3 = "Take one down, pass it around ";

        do {
            System.out.println(flaschen + text1 + flaschen + text2);
            flaschen--;
            System.out.println(text3 + flaschen + text1);
        } while ( flaschen > 1);

        System.out.println("One last bottle of beer on the wall, one last bottle of beer");
        System.out.println("Take it down, pass it around, no more bottles of beer on the wall");
    }
}