package d_02_06_2022_SektorRadnik;

import java.util.ArrayList;

public abstract class Radnik {
    protected String imeIPrezime;
    protected ArrayList<Sektor> nizSektora = new ArrayList<>();

    public abstract double plataRadnika();

    public void zaposliUSektor(Sektor s) {
        nizSektora.add(s);
    }


}
