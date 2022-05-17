package d_16_05_2022;

public class Zadatak5 {
//Napisati funkciju koja pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//Napomena: Resiti bez koriscenja petlji.

    public static void main(String[] args) {
        izbroji(-5, 1);
    }

    static void izbroji(int m, int n) {
        int x = n - m - 1;
        System.out.println(x);
    }
}
