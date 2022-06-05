package p_03_06_2022_Atleticar;

public abstract class Atleticar {
    private String imeIPrezime;
    protected double rezultat;

    public Atleticar(String imeIPrezime, double rezultat) {
        this.imeIPrezime = imeIPrezime;
        this.rezultat = rezultat;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }

    public abstract boolean boljiJe(Atleticar a);

    public void stampaj() {
        System.out.println("Ime " + this.imeIPrezime);
        System.out.println("rezultat: " + this.rezultat);
    }
    

}
