package p_23_05_2022;

public class Kupac {
    private String imeIPrezime;
    private ClanskaKarta clanskaKarta;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public Kupac(String imeIPrezime, ClanskaKarta clanskaKarta) {
        this.imeIPrezime = imeIPrezime;
        this.clanskaKarta = clanskaKarta;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setClanskaKarta(ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }
    public void stampa () {
System.out.println(imeIPrezime);
    }
}
