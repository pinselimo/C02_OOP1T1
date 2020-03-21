package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        herunterzaehlen(10,13);
    }

    public static void herunterzaehlen(int von, int bis) {
        if (von < bis) {
            return;
        }
        System.out.println(von);
        von--;
        herunterzaehlen(von,bis)
    }
}