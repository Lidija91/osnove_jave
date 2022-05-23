package d_19_05_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public Proizvod() {
    }

    public Proizvod(String naziv, double cena, double tezina) {
        this.naziv = naziv;
        this.cena = cena;
        this.tezina = tezina;
    }

    public void stampaj() {
        System.out.println(naziv + ", " + cena + ", " + tezina + "grama");
    }

    public void povecaj(double povecanje) {
        this.cena = cena + povecanje;
    }

    public double vratiCenuSaPopustom(double popust) {
        double novaCena = cena - cena * popust / 100;
        return novaCena;
    }

    public int racunajPostarinu() {
        int postarina;
        if (tezina <= 100) {
            postarina = 200;
        } else if (tezina <= 500) {
            postarina = 400;
        } else postarina = 1000;
        return postarina;
    }
}
