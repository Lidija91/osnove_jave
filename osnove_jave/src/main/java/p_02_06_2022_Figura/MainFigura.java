package p_02_06_2022_Figura;

import java.util.ArrayList;

public class MainFigura {
    public static void main(String[] args) {
        ArrayList<Figura> figure = new ArrayList<>();

       figure.add(new JednakostranicniTrougao(5));
        figure.add(new JednakostranicniTrougao(4));
        figure.add(new Pravougaonik(2,4));
        figure.add(new Pravougaonik(3,7));
        figure.add(new Pravougaonik(5,10));

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
        }

        double povrsine = 0;
        for (int i = 0; i < figure.size(); i++) {
           povrsine = povrsine + figure.get(i).povrsina();
        }

        System.out.println("Povrsine: " + povrsine);

        double obimi = 0;
        for (int i = 0; i < figure.size(); i++) {
            obimi = obimi + figure.get(i).obim();
        }
        System.out.println("Obimi " + obimi);


    }
}
