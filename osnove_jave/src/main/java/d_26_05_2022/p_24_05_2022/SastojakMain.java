package p_24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class SastojakMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList <Sastojak> niz = new ArrayList<>();

        System.out.println("Unesite n: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesi naziv: ");
            String naziv=s.next();
            System.out.println("Unesi cenu: ");
            int cena=s.nextInt();
            niz.add(new Sastojak(naziv,cena));

        }
        for (int i = 0; i < niz.size(); i++) {
//            niz.get(i).stampaj();
            System.out.println(niz.get(i).getNaziv());
            System.out.println(niz.get(i).getCena());
        }


    }
}
