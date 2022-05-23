package p_20_05_2022;

public class RadnikMain {

    public static void main(String[] args) {
        Radnik Lidija = new Radnik("2904991725000", "Lidija Milivojevic", 1, 7, 6);
        System.out.println("JMBG: " + Lidija.jmbg);
        double mR = Lidija.MinuliRad();
        System.out.println("Minuli rad: " + mR);
        double kS = Lidija.koeficSlozenosti();
        System.out.println("Koeficijent složenosti iznosi " + kS);
        double pl = Lidija.Plata();
        System.out.println("Plata je " + pl);

        boolean kSposoban = Lidija.KreditnoSposoban(pl);
        if (kSposoban = true) {
            System.out.println("Klijent je kreditno sposoban.");
        } else {
            System.out.println("Klijent nije kreditno sposoban.");
        }
        int sD = Lidija.daniOdmora();
        System.out.println("Zaposleni ima " + sD + " dana odmora godišnje.");


    }
}
