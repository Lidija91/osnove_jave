package P_16_05_2022;

public class Zadatak4 {
    public static void main(String[] args) {
//
//        4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//        Brojevi su ulazni parametri funkcije.
//                U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.
        operacije(10, 5);
        System.out.println();
        operacije(20, 9);
    }

    static void operacije(int a, int b) {

        int zbir = a + b;
        int razlika = a - b;
        int proizvod = a * b;
        double kolicnik = a / b;
        System.out.println("Zbir je " + zbir);
        System.out.println("Razlika je " + razlika);
        System.out.println("Proizvod je " + proizvod);
        System.out.println("Kolicnik je " + kolicnik);

    }
}
