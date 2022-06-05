package d_02_06_2022_SektorRadnik;

public class Magacioner extends Radnik {

    public Magacioner() {
    }

    private double racunajProsecnuPlatu() {
        double suma = 0;
        double prosecnaPlata = 1;
        for (int i = 0; i < nizSektora.size(); i++) {
            suma = suma + nizSektora.get(i).getPlata();
        }
        return prosecnaPlata = suma / nizSektora.size() * 0.5;
    }

    @Override
    public double plataRadnika() {
        return racunajProsecnuPlatu() * nizSektora.size();

    }

    public void stampaj() {
        System.out.println("Ime i prezime: " + imeIPrezime);
        System.out.println("Plata je " + plataRadnika() + "rsd.");
    }
}
