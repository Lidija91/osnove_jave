package p_03_06_2022_Atleticar;

public class Skakac extends Atleticar {
    public Skakac(String imeIPrezime, double rezultat) {
        super(imeIPrezime, rezultat);
    }

    @Override
    public boolean boljiJe(Atleticar a) {
        if (this.getRezultat() > a.getRezultat()) {
            return true;
        }
        return true;

    }

}
