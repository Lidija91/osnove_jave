package Vezbanje_za_test;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int jacina = 75;

        System.out.print("Akcija:");
        String akcija = s.next();
        while (!akcija.equals("PLAY"))
        {System.out.print("Akcija:");
            akcija = s.next();
            if (akcija.equals("up") && jacina<91)
            {jacina=jacina+10;}
            else if (akcija.equals("down") && jacina>9)
            {jacina=jacina-10;}
            else if (akcija.equals("mute"))
            {jacina=0;}
        }
        System.out.println("Jacina zvuka je: " + jacina + "%");

    }
}
