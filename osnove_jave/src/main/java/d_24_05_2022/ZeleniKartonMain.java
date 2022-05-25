package d_24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKartonMain {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> listaZelenihKartona = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj zelenih kartona: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite ime i prezime: ");
            String student = s.next();
            System.out.println("Unesite broj indeksa: ");
            String indeks = s.next();
            System.out.println("Unesite predmet: ");
            String ispit = s.next();
            System.out.println("Unesite profesora: ");
            String profesor = s.next();
            System.out.println("Unesite ocenu: ");
            int oc = s.nextInt();
            listaZelenihKartona.add(new ZeleniKarton(student, indeks, ispit, profesor, oc));

        }

        int zbir = 0;
        for (int i = 0; i < listaZelenihKartona.size(); i++) {
            listaZelenihKartona.get(i).stampaj();
            zbir = zbir + listaZelenihKartona.get(i).getOcena();
        }
        double prosek = zbir / listaZelenihKartona.size();
        System.out.println("Prosecna ocena je " + prosek);
    }
}
