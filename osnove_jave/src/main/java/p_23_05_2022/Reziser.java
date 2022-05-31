package p_23_05_2022.p_23_05_2022;

public class Reziser {

    private String imeIPrezime;
    private int starost;

    public String getImeIPrezime() {
        return this.imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getStarost() {
        return this.starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void stampaj() {
        System.out.println("Ime i prezime režisera: " + imeIPrezime + ", starost režisera: " + starost + "god");
    }
}
