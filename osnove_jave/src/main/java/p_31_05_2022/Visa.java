package p_31_05_2022;

public class Visa extends PlatnaKartica {

    private String ovlascenoLice;

    public Visa(int suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
    @Override
    public void izvrsiTransakciju (double transakcija) {
        double provizija=1.8/100*transakcija;
        suma=suma-transakcija-provizija;
        if (provizija<4) {provizija=4;}

    }
    @Override
    public void stampaj () {
        System.out.println("Visa Card: ");
        super.stampaj();
    }

}
