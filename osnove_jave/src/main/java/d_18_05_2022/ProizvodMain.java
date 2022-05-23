package d_18_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {

        Proizvod kafa = new Proizvod();
        kafa.naziv = "Bonito";
        kafa.tezina = 200.0;
        kafa.cena = 250;

        kafa.stampaj();

        Proizvod keks = new Proizvod();
        keks.naziv = "Jafa";
        keks.tezina = 100.0;
        keks.cena = 150;

        keks.stampaj();
    }
}
