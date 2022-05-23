package test_java;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite major verziju instalirane aplikacije: ");
        int majorVerzijaInstalirana = s.nextInt();
        System.out.println("Unesite minor verziju instalirane aplikacije: ");
        int minorVerzijaInstalirana = s.nextInt();
        System.out.println("Na racunaru je instalirana verzija " + majorVerzijaInstalirana + "." + minorVerzijaInstalirana);
        System.out.println("Unesite major verziju najnovije aplikacije: ");
        int majorNajnovijaVerzija = s.nextInt();
        System.out.println("Unesite minor verziju najnovije aplikacije: ");
        int minorNajnovijaVerzija = s.nextInt();
        if (majorNajnovijaVerzija > majorVerzijaInstalirana) {
            System.out.println("Notifikacija: Nova verzija aplikacije je dostupna za instalaciju.");
        } else if (majorNajnovijaVerzija == majorVerzijaInstalirana && minorNajnovijaVerzija > minorVerzijaInstalirana) {
            System.out.println("Notifikacija: Nova verzija aplikacije je dostupna za instalaciju.");
        } else {
            System.out.println("Notifikacija: Vec imate najnoviju verziju na svom racunaru.");
        }
    }
}
