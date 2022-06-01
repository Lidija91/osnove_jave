package p_31_05_2022;

public class PlatnaKartica {

    protected double suma;
    protected String brojKartice;
    protected int godina;
    protected int mesec;

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }

    public PlatnaKartica(int suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;

    }
    public void dodajSredsta (double novaSredstva) {
        suma=suma+novaSredstva;
    }
    public void izvrsiTransakciju (double transakcija) {
        suma=suma-transakcija;
        if (suma<transakcija) {
            suma=suma;
        }
    }
    public void stampaj () {
        System.out.println(this.brojKartice + ", " + this.mesec +
                "/" + this.godina + ", $" + suma);
    }
}
