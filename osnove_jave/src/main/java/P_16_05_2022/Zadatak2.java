package P_16_05_2022;

public class Zadatak2 {
    public static void main(String[] args) {
        //Zadatak
        //Napisati dve metode, jedna metoda sluzi za stampanje imena a druga sluzi za stampanje prezimena.
        // U glavnom programu pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
        //Primer izvrsenja:
        //Milan Jovanovic
        int i;
        for (i = 0; i < 5; i++) {

            PrintFirstName(i);
            PrintLastName(i);
        }
    }

    static void PrintFirstName(int i) {
        System.out.print("Lidija ");
    }

    static void PrintLastName(int i) {
        System.out.println("Milivojevic");
    }
}
