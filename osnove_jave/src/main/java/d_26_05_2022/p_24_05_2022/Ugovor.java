package p_24_05_2022;

public class Ugovor {

    private String godinaDanMesec;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cena;
    private String adresa;

    public String getGodinaDanMesec() {
        return godinaDanMesec;
    }

    public void setGodinaDanMesec(String godinaDanMesec) {
        this.godinaDanMesec = godinaDanMesec;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public void setProdavac(FizickoLice prodavac) {
        this.prodavac = prodavac;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public void setKupac(FizickoLice kupac) {
        this.kupac = kupac;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Ugovor(String godinaDanMesec, FizickoLice prodavac, FizickoLice kupac, int cena, String adresa) {
        this.godinaDanMesec = godinaDanMesec;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }

    public double procenatZarade() {
        if (this.kupac.isKupovalaJe()) {
            return 0.02;
        } else return 0.03;
    }

    public double zaradaAgencije() {
        return  1000 + this.cena * this.procenatZarade();

    }

    public void stampaUgovora() {
        System.out.print("Dana " + this.godinaDanMesec + "god sklopljen je ugovor izmedju ");
        this.prodavac.stampaj();
        System.out.print(" i ");
        this.kupac.stampaj();
        System.out.println(" o kupovini nekretnine " + this.adresa +
                ", po ceni od " + this.cena + "rsd, ");
        System.out.print("pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od ");
        System.out.println(zaradaAgencije() + " rsd.");
    }
}
