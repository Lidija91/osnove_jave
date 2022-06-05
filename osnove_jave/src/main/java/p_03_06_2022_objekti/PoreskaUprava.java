package p_03_06_2022_objekti;

import java.util.ArrayList;

public class PoreskaUprava {
    private String imeGrada;
    private ArrayList<Objekat> nizObjekata = new ArrayList<>();

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public void dodajObjekat(Objekat o) {
        nizObjekata.add(o);
    }

    public void racunajPorezZaSve() {
        double ukupanPorez = 0;
        for (int i = 0; i < nizObjekata.size(); i++) {
            ukupanPorez += nizObjekata.get(i).racunajPorez();
        }
    }

    public void stampaj() {
        for (int i = 0; i < nizObjekata.size(); i++) {
            System.out.println(nizObjekata.get(i).adresa);
            System.out.println("Povrsina " + nizObjekata.get(i).povrsinaObjekta);
            System.out.println("Porez je " + this.nizObjekata.get(i).racunajPorez());
        }
    }

    public Objekat najveciPorez() {
        double maxPorez = 0;
        int index = 0;
        for (int i = 0; i < nizObjekata.size(); i++) {
            maxPorez = nizObjekata.get(0).racunajPorez();
            if (nizObjekata.get(i).racunajPorez() > maxPorez) {
                maxPorez = nizObjekata.get(i).racunajPorez();
                index = i;
            }
        }
        ;
        return nizObjekata.get(index);

    }

}
