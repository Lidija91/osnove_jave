package d_18_05_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj () {
        System.out.print("{" + naziv + "},");
        System.out.print("{" + cena + "},");
        System.out.println("{" + tezina + "}");
    }
}
