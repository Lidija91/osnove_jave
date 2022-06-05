package d_03_06_2022_ambalaza;

public class Main {
    public static void main(String[] args) {
        Korpa Ksenija = new Korpa();
        Ksenija.dodajAmbalazu(new Tetrapak("8401025896","jogurt",150,200,true,140));
        Ksenija.dodajAmbalazu(new Tetrapak("1213456","mleko",100,150,true,100));
        Ksenija.dodajAmbalazu(new StaklenaAmbalaza("852085208520","pivo",500,600, 10,true,60));
        Ksenija.dodajAmbalazu(new StaklenaAmbalaza("123456789","koka kola",200,150,0,false,40));
        Ksenija.izbaciAmbalazu("8401025896");

        Ksenija.stampaj();







    }
}
