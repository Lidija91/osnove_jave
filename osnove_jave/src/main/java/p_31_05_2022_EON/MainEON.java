package p_31_05_2022_EON;

public class MainEON {
    public static void main(String[] args) {
        EONPaket e = new EONPaket("Lidija M", 3500, 24);
        e.stampaj();

        DUOPaket d = new DUOPaket("Ksendzis", 5000, 36);
        d.stampaj();
        d.povecanjeBrzine(20);
        d.stampaj();
    }
}
