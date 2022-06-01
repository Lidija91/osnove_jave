package p_31_05_2022;

public class Profesor extends Osoba {
    private String predmet;
    private double plata;

    public Profesor(String imeIPrezime, String jmbg, String predmet, int plata) {
        super(imeIPrezime, jmbg);
        this.predmet = predmet;
        this.plata = plata;
    }
    public void povecajPlatu (double procenat) {
        plata=plata*(1+procenat/100);
    }
    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println("Predmet: " + this.predmet + ", " + "Plata je: " + this.plata + "rsd");
    }
}
