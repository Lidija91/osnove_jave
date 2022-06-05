package p_03_06_2022_objekti;

public class Zgrada extends Objekat {
    private int brojStanova;

    public Zgrada(String adresa, double povrsinaObjekta, int zona, int brojStanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double racunajPorez() {
        return koefZaPorez() * povrsinaObjekta * brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.println("Zgrada");
        System.out.println("adresa " + adresa);
        System.out.println("povrsina " + povrsinaObjekta);
        System.out.println("Zona: " + zona);
        System.out.println("Broj stanova je " + brojStanova);
    }
}
