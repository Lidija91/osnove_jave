package d_31_05_2022;

public class Trener extends Osoba {
    private int godineIskustva;
    private String tipTrenera;


    public Trener(String imeIPrezime, String jmbg, int godRodjenja, int godineIskustva, String tipTrenera) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("godine iskustva " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tipTrenera);
    }
}
