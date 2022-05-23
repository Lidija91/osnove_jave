package p_20_05_2022;

public class Radnik {
    public String jmbg;
    public String imeIPrezime;
    public int brojDece;
    public int stepenStrucneSpreme;
    public int godineRadnogStaza;

    public Radnik(String jmbg) {
        this.jmbg = jmbg;
    }

    public Radnik(String jmbg, String imeIPrezime, int brojDece, int stepenStrucneSpreme, int godineRadnogStaza) {
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpreme = stepenStrucneSpreme;
        this.godineRadnogStaza = godineRadnogStaza;
    }


    public double MinuliRad() {
        double minuliRad = 1;
        if (godineRadnogStaza <= 10) {
            minuliRad = 1.05;
        } else if (godineRadnogStaza > 10 && godineRadnogStaza <= 20) {
            minuliRad = 1.075;
        } else if (godineRadnogStaza > 20) {
            minuliRad = 1.1;
        }
        return minuliRad;
    }

    public double koeficSlozenosti() {
        double koeficijentSlozenosti = 1;
        if (stepenStrucneSpreme == 1) {
            koeficijentSlozenosti = 1.03;
        } else if (stepenStrucneSpreme == 2) {
            koeficijentSlozenosti = 1.65;
        } else if (stepenStrucneSpreme == 3) {
            koeficijentSlozenosti = 2.0;
        } else if (stepenStrucneSpreme == 4) {
            koeficijentSlozenosti = 2.27;
        } else if (stepenStrucneSpreme == 5) {
            koeficijentSlozenosti = 2.88;
        } else if (stepenStrucneSpreme == 6) {
            koeficijentSlozenosti = 3.09;
        } else if (stepenStrucneSpreme == 7) {
            koeficijentSlozenosti = 3.40;
        } else if (stepenStrucneSpreme == 8) {
            koeficijentSlozenosti = 4.12;
        }
        return koeficijentSlozenosti;
    }

    public double Plata() {
        double plata = 25000 + 10000 * (koeficSlozenosti() * MinuliRad());
        return plata;
    }

    public boolean KreditnoSposoban(double plata) {
        return plata > 50000;
    }

    public int daniOdmora() {
        int slobodniDani = 22 + brojDece * 2;
        return slobodniDani;
    }

}
