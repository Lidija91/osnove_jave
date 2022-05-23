package p_18_05_2022;

import java.util.Scanner;

public class MainRacuni {
    public static void main(String[] args) {
        Racun l = new Racun();
        l.broj = "200-1234567891012-25";
        l.imeIPrezime = "Lidija Milivojevic";
        l.stanje = 10000;

//        System.out.println("Broj racuna " + l.broj);
//        System.out.println("Ime i prezime " + l.imeIPrezime);
//        System.out.println("Stanje na racunu " + l.stanje);
//        System.out.println();
        Racun a = new Racun();
        Scanner s = new Scanner(System.in);
        a.broj = "370-1234567891012-44";
        a.imeIPrezime = "Aleksandar Nesovic";
        a.stanje = 200000;
//        System.out.println("Broj racuna " + a.broj);
//        System.out.println("Ime i prezime " + a.imeIPrezime);
//        System.out.println("Stanje na racunu " + a.stanje);

        System.out.println("Posaljilac: " + l.imeIPrezime + ", " + l.broj + ", stanje: " + l.stanje);
        System.out.println("Primalac: " + a.imeIPrezime + ", " + a.broj + ", stanje: " + a.stanje);
        System.out.println("Unesite sumu za transakciju: ");
        int suma = s.nextInt();
        System.out.println("Stanje nakon transakcije: ");
        l.stanje = l.stanje - suma;
        a.stanje = a.stanje + suma;
        System.out.println("Posaljilac: " + l.imeIPrezime + ", " + l.broj + ", stanje: " + l.stanje);
        System.out.println("Primalac: " + a.imeIPrezime + ", " + a.broj + ", stanje: " + a.stanje);


    }
}
