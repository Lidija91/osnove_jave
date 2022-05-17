package P_16_05_2022;

public class Zadatak3 {
    public static void main(String[] args) {
        //Napisati metodu koja stampa zvezdicu sa razmakom.
        // U glavnom programu je potrebno odstampati sledecu sliku:
        //*  *  *
        //*  *
        //*

        for (int i = 0; i < 6; i++) {
            zvezdica();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            zvezdica();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            zvezdica();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            zvezdica();
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            zvezdica();
        }
        System.out.println();
        zvezdica();

    }

    static void zvezdica() {
        System.out.print("* ");
    }
}
