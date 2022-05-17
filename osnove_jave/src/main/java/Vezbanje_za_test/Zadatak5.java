package Vezbanje_za_test;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u eurima: ");
        double vrednost = s.nextDouble();
        System.out.println("Unesite valutu za konverziju: ");
        String valuta = s.next();
        double rezultat = 1;
        if (valuta.equals("RSD")) {
            rezultat = 117.2113 * vrednost;
        } else if (valuta.equals("USD")) {
            rezultat = 1.1821 * vrednost;
        } else if (valuta.equals("RUB")) {
            rezultat = 89.2323 * vrednost;
        }

        System.out.println(vrednost + "EUR je " + rezultat + " RSD.");
    }
}
