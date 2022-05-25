package p_23_05_2022;

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private int cena;

    public String getNaziv() {
        return naziv;
    }

    public Proizvod(String naziv, Kupac kupac, int cena) {
        this.naziv = naziv;
        this.kupac = kupac;
        this.cena = cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public int getCena() {
        return cena;
    }
    public double racunanjeCene () {
        double snizenje = kupac.getClanskaKarta().getPopust();
       double novaCena = cena * 1.9 * (100-snizenje)/100;
        return novaCena;
    }
    public void stampa () {
        System.out.println(naziv + " " + cena);
        kupac.getClanskaKarta().stampa();

    }
}
