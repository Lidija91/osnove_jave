package d_03_06_2022_ambalaza;

public class Tetrapak extends Ambalaza {
    private boolean mozeSeReciklirati;
    private double osnovnaCena;

    public boolean isMozeSeReciklirati() {
        return mozeSeReciklirati;
    }

    public void setMozeSeReciklirati(boolean mozeSeReciklirati) {
        this.mozeSeReciklirati = mozeSeReciklirati;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(boolean mozeSeReciklirati, double osnovnaCena) {
        this.mozeSeReciklirati = mozeSeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean mozeSeReciklirati, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.mozeSeReciklirati = mozeSeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double vratiCenu() {
        if (mozeSeReciklirati) return racunajTezinuPakovanja()*1.5+this.osnovnaCena;
        else return this.osnovnaCena ;
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + getBarkod());
        System.out.println("Naziv artikla: " + getNaziv());
        System.out.println("Tezina je: " + racunajTezinuPakovanja());
        if (mozeSeReciklirati) {System.out.println("Moze se reciklirati.");}
        System.out.println("Cena je: " + vratiCenu());

    }
}
