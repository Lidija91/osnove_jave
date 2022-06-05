package d_03_06_2022_ambalaza;

public class SuperKartica {
    private String brojKartice;
    private String imeIprezimeVlasnika;
    private double popust;

    public SuperKartica(String brojKartice, String imeIprezimeVlasnika, double popust) {
        this.brojKartice = brojKartice;
        this.imeIprezimeVlasnika = imeIprezimeVlasnika;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIprezimeVlasnika() {
        return imeIprezimeVlasnika;
    }

    public void setImeIprezimeVlasnika(String imeIprezimeVlasnika) {
        this.imeIprezimeVlasnika = imeIprezimeVlasnika;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public void stampaj() {
        System.out.println(this.brojKartice + " " + this.imeIprezimeVlasnika);
    }
}
