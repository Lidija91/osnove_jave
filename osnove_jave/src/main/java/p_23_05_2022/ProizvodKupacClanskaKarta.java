package p_23_05_2022.p_23_05_2022;

public class ProizvodKupacClanskaKarta {
    public static void main(String[] args) {

        ClanskaKarta cK = new ClanskaKarta(10, "123456");
        Kupac kupac1 = new Kupac("Lidija Mil",cK);
        Proizvod pD = new Proizvod("sladoled", kupac1, 100);

        pD.stampa();



    }
}
