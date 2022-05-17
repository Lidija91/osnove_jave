package P_16_05_2022;

public class Zadatak3a {
    public static void main(String[] args) {
        //Napisati metodu koja stampa zvezdicu sa razmakom.
        // U glavnom programu je potrebno odstampati sledecu sliku:
        //*  *  *  *  *  *
        //*  *  *  *  *
        //*  *  *  *
        //*  *  *
        //*  *
        //*
        int duzina = 6;
        int dimenzija = duzina * (duzina + 1) /2;
        int predjiUDrugiRed = 6;
        for (int i = 0; i < dimenzija; i++) {
           if (predjiUDrugiRed==duzina)
            System.out.println(" ");
           predjiUDrugiRed=predjiUDrugiRed-1;
           duzina--;
        }
    }
    static void zvezdica() {
        System.out.print("* ");
    }
}
