package p_03_06_2022_objekti;

public class Lokal extends Objekat {
    public Lokal(String adresa, double povrsinaObjekta, int zona) {
        super(adresa, povrsinaObjekta, zona);
    }

    @Override
    public double racunajPorez() {
        return koefZaPorez() * povrsinaObjekta * 1.3;
    }

    @Override
    public void stampaj() {
        System.out.println("Lokal");
        System.out.println("adresa " + adresa);
        System.out.println("povrsina " + povrsinaObjekta);
        System.out.println("Zona: " + zona);
    }
}
