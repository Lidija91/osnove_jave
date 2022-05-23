package p_20_05_2022;

public class TackaMain {
    public static void main(String[] args) {


        Tacka a = new Tacka();

        a.x = 10;
        a.y = 11;

        a.stampa();

        Tacka b = new Tacka(5, 6);
        b.stampa();
    }
}