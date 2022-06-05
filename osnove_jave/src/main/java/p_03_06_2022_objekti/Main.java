package p_03_06_2022_objekti;

public class Main {
    public static void main(String[] args) {

        Kuca k = new Kuca("JNA", 270, 1, 4);
        Zgrada z = new Zgrada("Pozorisna", 700, 2, 30);
        Lokal l = new Lokal("Kneza Milosa", 100, 3);

        PoreskaUprava p = new PoreskaUprava("Kragujevac");
        p.dodajObjekat(k);

        p.dodajObjekat(z);
        p.dodajObjekat(l);
        p.stampaj();
        System.out.println("Najveci porez ima objekat na adresi ");
        p.najveciPorez().stampaj();
    }
}
