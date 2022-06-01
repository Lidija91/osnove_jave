package p_31_05_2022;

public class KarticeMain {
    public static void main(String[] args) {
        Visa v = new Visa(10000, "4576-4567-852-4568",2022, 9, "Lidija");
        MasterCard m = new MasterCard(200000, "5467-4000-8000-2000", 2023,6);

        v.izvrsiTransakciju(100.00);
        v.stampaj();
    }
}
