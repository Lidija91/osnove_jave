package p_23_05_2022.p_23_05_2022;

public class ClanskaKarta {
    private int popust;
    private String brojKartice;

    public int getPopust() {
        return popust;
    }

    public ClanskaKarta(int popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }
    public void stampa () {

        System.out.println(this.brojKartice);
    }
}
