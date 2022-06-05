package d_02_06_2022_SektorRadnik;

public class Main {
    public static void main(String[] args) {
        Magacioner m = new Magacioner();
        m.imeIPrezime = "Lidija M";

        Magacioner n = new Magacioner();
        n.imeIPrezime = "Ksenija";
        Sektor s = new Sektor("magacin", 40000);
        Sektor a = new Sektor("lakirnica", 70000);

        m.zaposliUSektor(s);
        n.zaposliUSektor(a);

        Menadzer l = new Menadzer();
        l.imeIPrezime = "Luka L";
        l.plataRadnika();
        l.zaposliUSektor(new Sektor("finansije", 60000));


        l.stampaj();
        m.stampaj();

    }
}
