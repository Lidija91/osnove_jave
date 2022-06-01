package d_31_05_2022;

public class Igrac extends Osoba {
    private int brojNaDresu;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {

    }


    public Igrac(String imeIPrezime, String jmbg, int godRodjenja, int brojNaDresu, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.brojNaDresu = brojNaDresu;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBrojNaDresu() {
        return brojNaDresu;
    }

    public void setBrojNaDresu(int brojNaDresu) {
        this.brojNaDresu = brojNaDresu;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    @Override
    public void stampaj() {
        super.stampaj();
//        System.out.println(this.brojNaDresu + ", pozicija " + this.pozicija);
//        if (kapiten = true) {
//            System.out.println("Kapiten");
//        }
    }
}
