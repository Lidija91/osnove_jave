package P_16_05_2022;

public class Zadatak5 {
    public static void main(String[] args) {
//
// 5. Zadatak
//Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.
        apsolutnaVrednost(-5);
    }

    static void apsolutnaVrednost(int a) {
        if (a < 0) {
            a = a * (-1);
        }
        System.out.println("Apsolutna vrednost je: " + a);


    }
}