package p_24_05_2022.p_24_05_2022;

public class Korisnik {
    private String imeIPrezime;
    private String tip;

    public Korisnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
        this.tip = "basic";
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTip() {
        return tip;
    }

    public void pretplatiSe(int uplata) {
        if (uplata == 100) {
            tip = "pro";
        } else if (uplata == 150) {
            tip = "premium";
        }

    }

    public void ponistiPretplatu() {
        tip = "basic";
    }

    public int maxDuzina() {
        int maxDuzina;
        if (tip.equals("basic")) {
            maxDuzina = 40;
        } else if (tip.equals("pro")) {
            maxDuzina = 240;
        } else {
            maxDuzina = 1440;
        }
        return maxDuzina;
    }
}