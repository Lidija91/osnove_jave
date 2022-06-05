package p_03_06_2022_objekti;

public class Kuca extends Objekat {
    private int brojClanova;

    public Kuca(String adresa, double povrsinaObjekta, int zona, int brojClanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double racunajPorez() {
        return koefZaPorez()*povrsinaObjekta;
    }

    @Override
    public void stampaj() {
        System.out.println("Kuca");
        System.out.println("adresa " + adresa);
        System.out.println("povrsina " + povrsinaObjekta);
        System.out.println("Zona: " + zona);
        System.out.println("Broj clanova je " + brojClanova);
    }
}
