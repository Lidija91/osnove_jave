package d_24_05_2022;

public class Racun {
    private String brojRacuna;
    private String imeIPrezime;
    private double trenutnoStanje;

    public Racun(String brojRacuna, String imeIPrezime, int trenutnoStanje) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezime = imeIPrezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public double menjajStanje(double novoStanje) {
        if (novoStanje > 0) {
            trenutnoStanje = trenutnoStanje + novoStanje;
        } else if (novoStanje < 0 && novoStanje < trenutnoStanje) {
            trenutnoStanje = trenutnoStanje - novoStanje;
        } else trenutnoStanje = trenutnoStanje;
        return trenutnoStanje;
    }

    public void stampaj() {
        System.out.println(this.imeIPrezime + " - " + brojRacuna);
        System.out.println("Stanje na racunu je " + trenutnoStanje + "rsd.");
    }
}
