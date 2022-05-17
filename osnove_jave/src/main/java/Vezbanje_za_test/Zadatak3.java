package Vezbanje_za_test;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int jacina = 75;
        String akcija = "pocetak";
        int PoslednjaJacinaPreMute = 75;
        String MutiranoJe = "ne";
        while (!akcija.equals("PLAY")) {
            System.out.print("Akcija:");
            akcija = s.next();
            if (akcija.equals("up") && jacina < 91) {
                jacina = jacina + 10;
                PoslednjaJacinaPreMute = jacina;
            } else if (akcija.equals("down") && jacina > 9) {
                jacina = jacina - 10;
                MutiranoJe = "ne";
                PoslednjaJacinaPreMute = jacina;
            } else if (akcija.equals("mute")) {
                PoslednjaJacinaPreMute = jacina;
                jacina = 0;
                MutiranoJe = "da";
            } else if (akcija.equals("unmute")) {
                if (MutiranoJe.equals("da")) {
                    jacina = PoslednjaJacinaPreMute;
                } else jacina = 75;
            }
            System.out.println(jacina);
        }
        System.out.println("Jacina zvuka je: " + jacina + "%");

    }
}
