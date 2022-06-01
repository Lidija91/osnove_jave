package d_31_05_2022;

public class IgracTrenerMain {
    public static void main(String[] args) {
        Igrac Cobe = new Igrac("Aca Nesovic", "0303259756312", 1991, 8, "napadac", true);
        Igrac Lida = new Igrac("Lidija Nesovic", "2904852712589", 1991, 12, "napadac", false);

        Trener Zoki = new Trener("Zoran M", "1909598756311", 1959, 30, "personalni");
        Trener Milenko = new Trener("Milenko N", "123456985", 1955, 20, "kondicioni");

        Cobe.stampaj();
        Lida.stampaj();
        Zoki.stampaj();
    }
}
