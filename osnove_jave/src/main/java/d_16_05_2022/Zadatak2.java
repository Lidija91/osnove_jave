package d_16_05_2022;

public class Zadatak2 {
    //    Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
//    vraca novu vrednost koja se formira kao na primeru:
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
    public static void main(String[] args) {
        int x = novaVrednost(2, 3);
        System.out.println(x);

    }

    static int novaVrednost(int a, int b) {
        int c = a * 10 + b;
        return c;


    }
}
