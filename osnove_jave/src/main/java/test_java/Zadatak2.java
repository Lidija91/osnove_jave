package test_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();
        nizBrojeva.add(3);
        nizBrojeva.add(1);
        nizBrojeva.add(8);
        nizBrojeva.add(0);
        nizBrojeva.add(1);

        nizBrojeva.add(1);
        nizBrojeva.add(5);
        nizBrojeva.add(7);
        nizBrojeva.add(9);
        nizBrojeva.add(6);

        nizBrojeva.add(3);
        nizBrojeva.add(1);
        nizBrojeva.add(6);
        nizBrojeva.add(5);
        nizBrojeva.add(1);

        nizBrojeva.add(4);
        nizBrojeva.add(5);
        nizBrojeva.add(8);
        nizBrojeva.add(1);
        nizBrojeva.add(7);

        nizBrojeva.add(1);
        nizBrojeva.add(3);
        nizBrojeva.add(2);
        nizBrojeva.add(8);
        nizBrojeva.add(0);
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < nizBrojeva.size(); i++) {
            System.out.print(nizBrojeva.get(i) + ", ");
            if (i % 5 == 4) System.out.println();

        }
        System.out.println("Unesite kolonu za sumiranje: ");
        int brojKolone = s.nextInt();
        int suma = 0;
        for (int i = 0; i < nizBrojeva.size(); i++) {
            if (brojKolone == 0) {
                suma = nizBrojeva.get(0) + nizBrojeva.get(5) + nizBrojeva.get(10) + nizBrojeva.get(15) + nizBrojeva.get(20);
            } else if (brojKolone == 1) {
                suma = nizBrojeva.get(1) + nizBrojeva.get(6) + nizBrojeva.get(11) + nizBrojeva.get(16) + nizBrojeva.get(21);
            } else if (brojKolone == 2) {
                suma = nizBrojeva.get(2) + nizBrojeva.get(7) + nizBrojeva.get(12) + nizBrojeva.get(17) + nizBrojeva.get(22);
            } else if (brojKolone == 3) {
                suma = nizBrojeva.get(3) + nizBrojeva.get(8) + nizBrojeva.get(13) + nizBrojeva.get(18) + nizBrojeva.get(23);
            } else if (brojKolone == 4) {
                suma = nizBrojeva.get(4) + nizBrojeva.get(9) + nizBrojeva.get(14) + nizBrojeva.get(19) + nizBrojeva.get(24);
            }
        }

        System.out.println("Suma je " + suma);
    }
}
