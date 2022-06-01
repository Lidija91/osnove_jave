package p_31_05_2022;

public class Osoba {
    protected String imeIPrezime;
    protected String jmbg;

    public Osoba(String imeIPrezime, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
    }

    public void stampaj () {
        System.out.println("Ime i Prezime: " + this.imeIPrezime + ", " + "JMBG: " + this.jmbg);
    }
}
