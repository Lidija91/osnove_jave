package d_24_05_2022;

public class Transakcija {
    private String id;
    private Racun racunUplatioca;
    private Racun racunPrimaoca;
    private Racun racun;

    public Transakcija(String id, Racun racunUplatioca, Racun racunPrimaoca) {
        this.id = id;
        this.racunUplatioca = racunUplatioca;
        this.racunPrimaoca = racunPrimaoca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getRacunUplatioca() {
        return racunUplatioca;
    }

    public void setRacunUplatioca(Racun racunUplatioca) {
        this.racunUplatioca = racunUplatioca;
    }

    public Racun getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public void setRacunPrimaoca(Racun racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }
    private double provizija (double iznosTransakcije) {
        if (iznosTransakcije<4500){
        return 45;
        }
        else return 0.01 * iznosTransakcije;
    }
    public void izvrsiTransakciju (double iznosTransakcije) {
        racunPrimaoca.menjajStanje(iznosTransakcije);
        racunUplatioca.menjajStanje(-iznosTransakcije);
        racunUplatioca.menjajStanje(-provizija(iznosTransakcije));
    }
}
