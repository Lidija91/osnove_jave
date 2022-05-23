package d_19_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {

        Proizvod jogurt = new Proizvod("Kravica", 40, 200);
        jogurt.stampaj();

        Proizvod sladoled = new Proizvod();
        sladoled.naziv = "Sendvic";
        sladoled.cena = 100;
        sladoled.tezina = 250;

        sladoled.stampaj();

        jogurt.povecaj(3);
        jogurt.stampaj();

        double novaCena = jogurt.vratiCenuSaPopustom(50);
        System.out.println(novaCena);

        int postarina = jogurt.racunajPostarinu();
        System.out.println("Postarina je " + postarina);
    }
}
