package Vezbanje_za_test;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite težinu osobe(kg): ");
        double tezina = s.nextDouble();
        System.out.println("Unesite visinu osobe(m): ");
        double visina = s.nextDouble();
        double bmi = tezina/(visina*visina);
        String kategorija;
        if (bmi<18.5) {
            kategorija = "Neuhranjenost";
        }
        else if (bmi>=18.5 && bmi<25) {
            kategorija = "Normalna težina";
        }
    else if (bmi>=25 && bmi<30)
        {kategorija = "Prekomerna težina";}
    else {
        kategorija= "Gojaznost";
        }
        System.out.println("Kategorija je " + kategorija);
    }

}
