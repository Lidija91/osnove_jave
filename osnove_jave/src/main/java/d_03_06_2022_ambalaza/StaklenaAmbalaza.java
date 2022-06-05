package d_03_06_2022_ambalaza;

public class StaklenaAmbalaza extends Ambalaza {

    private double kaucijaZaAmbalazu;
    private boolean placaSeKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(double kaucijaZaAmbalazu, boolean placaSeKaucija, double osnovnaCena) {
        this.kaucijaZaAmbalazu = kaucijaZaAmbalazu;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, double kaucijaZaAmbalazu, boolean placaSeKaucija, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucijaZaAmbalazu = kaucijaZaAmbalazu;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucijaZaAmbalazu() {
        return kaucijaZaAmbalazu;
    }

    public void setKaucijaZaAmbalazu(double kaucijaZaAmbalazu) {
        this.kaucijaZaAmbalazu = kaucijaZaAmbalazu;
    }

    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }

    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double vratiCenu() {
       if (placaSeKaucija) return this.osnovnaCena*1.2+kaucijaZaAmbalazu;
       else return this.osnovnaCena*1.2;
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + getBarkod());
        System.out.println("Naziv artikla: " + getNaziv());
        System.out.println("Tezina je: " + racunajTezinuPakovanja());
        if (placaSeKaucija) {System.out.println("Kaucija se placa");}
        System.out.println("Cena je: " + vratiCenu());
        System.out.println();
    }
}
