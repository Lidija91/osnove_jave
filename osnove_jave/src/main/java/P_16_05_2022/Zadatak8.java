package P_16_05_2022;

public class Zadatak8 {
    public static void main(String[] args) {
// 8. Zadatak
//Napisati metodu koja proverava da li je trougao pravougli.
// Metoda prima stranice trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c
        boolean x = DaLiJeTrougaoPravougli(3, 4, 5);
        if (x == true)
        {
            System.out.println("Jeste pravougli.");
        }
       else{
            System.out.println("Nije pravougli.");
        }
    }


    static boolean DaLiJeTrougaoPravougli(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }
    }
}

