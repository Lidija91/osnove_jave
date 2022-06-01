package p_31_05_2022;

public class MasterCard extends PlatnaKartica {
    public MasterCard(int suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }

    @Override
    public void izvrsiTransakciju(double transakcija) {
        double provizija = (1 + 1.5 / 100) * transakcija;
        suma = suma + transakcija + provizija;
    }
    public void naplatiOdrzavanje () {
        suma=suma-2;
    }
    @Override
    public void stampaj () {
        System.out.println("Master Card: ");
        super.stampaj();
    }
}
