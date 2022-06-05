package d_02_06_2022_SektorRadnik;

public class Menadzer extends Radnik {
    public Menadzer() {
    }

    @Override
    public double plataRadnika() {
        int suma = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            suma += nizSektora.get(i).getPlata();
        }
        return suma;
    }

    public void stampaj() {
        System.out.println("Ime i prezime: " + imeIPrezime);
        System.out.println("Plata je " + plataRadnika() + "rsd.");
    }

}
