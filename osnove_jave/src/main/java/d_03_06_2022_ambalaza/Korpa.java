package d_03_06_2022_ambalaza;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza ambalaza) {
        nizAmbalaza.add(ambalaza);
    }

    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            if (barkod.equals(nizAmbalaza.get(i).getBarkod())) {
                nizAmbalaza.remove(i);
            }
        }
    }

    private double ukupnaCenaKorpe(double popust) {

        return 0;
        }
        public void cenaKorpe (SuperKartica s){
            double cenaKorpe = 0;
            for (int i = 0; i < nizAmbalaza.size(); i++) {
                cenaKorpe += nizAmbalaza.get(i).vratiCenu() - s.getPopust();
            }
        }
        public void stampaj () {
            for (int i = 0; i < nizAmbalaza.size(); i++) {
                System.out.println(nizAmbalaza.get(i).getNaziv());
                System.out.println(nizAmbalaza.get(i).getBarkod());
                System.out.println(nizAmbalaza.get(i).vratiCenu()+"rsd");
                System.out.println();

            }
            System.out.print("Ukupna cena korpe je: ");
        }
    }
