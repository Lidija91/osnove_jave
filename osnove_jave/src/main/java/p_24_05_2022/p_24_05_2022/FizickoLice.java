package p_24_05_2022.p_24_05_2022;

public class FizickoLice {
    private String imeIPrezime;
    private String brojLK;
    private String jmbg;
    private boolean kupovalaJe;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(String brojLK) {
        this.brojLK = brojLK;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isKupovalaJe() {
        return kupovalaJe;
    }

    public void setKupovalaJe(boolean kupovalaJe) {
        this.kupovalaJe = kupovalaJe;
    }

    public FizickoLice(String imeIPrezime, String brojLK, String jmbg, boolean kupovalaJe) {
        this.imeIPrezime = imeIPrezime;
        this.brojLK = brojLK;
        this.jmbg = jmbg;
        this.kupovalaJe = kupovalaJe;
    }

    public void stampaj() {
        System.out.print(imeIPrezime + ", " + brojLK);
    }
}
