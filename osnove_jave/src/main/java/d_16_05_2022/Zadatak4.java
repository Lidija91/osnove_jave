package d_16_05_2022;

public class Zadatak4 {
//    Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
/// / / / /

    public static void main(String[] args) {
        stampanjeKarakteraPoIzboru(5, "*");
    }

    static void stampanjeKarakteraPoIzboru(int n, String karakter) {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter);

        }

    }
}
