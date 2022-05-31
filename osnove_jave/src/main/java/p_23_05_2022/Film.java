package p_23_05_2022.p_23_05_2022;

public class Film {

    private String naziv;
    private int godina;

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return this.godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void stampa() {
        System.out.println("Naziv filma: " + naziv + ", godina: " + godina);
    }
}
