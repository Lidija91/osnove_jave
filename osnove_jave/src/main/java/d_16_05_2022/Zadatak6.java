package d_16_05_2022;

public class Zadatak6 {
    public static void main(String[] args) {
//(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
// U glavnom programu iskoristi funkciju i ispisati odgovarajucu poruku.
        int minimum = najmanjiOdPonudjenih(5, 1, -5);
        System.out.println("Broj " + minimum + " je najmanji.");
    }

    static int najmanjiOdPonudjenih(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
