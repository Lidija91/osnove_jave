package d_26_05_2022;

public class SastojakPastaMain {
    public static void main(String[] args) {

        Sastojak voda = new Sastojak("voda", 10);
        Sastojak aktivniUgalj = new Sastojak("Aktivni Ugalj", 50);
        Sastojak kalcijum = new Sastojak("Kalcijum", 30);

        Pasta colgate = new Pasta();

        colgate.dodajSastojak(voda);
        colgate.dodajSastojak(aktivniUgalj);
        colgate.dodajSastojak(kalcijum);

        colgate.stampa();
        colgate.brisanjeSastojaka("voda");
        colgate.stampa();


    }
}
