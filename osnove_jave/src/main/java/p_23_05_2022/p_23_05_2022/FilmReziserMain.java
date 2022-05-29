package p_23_05_2022.p_23_05_2022;

public class FilmReziserMain {
    public static void main(String[] args) {

        Film film1 = new Film();
        film1.setNaziv("Titanik");
        film1.setGodina(1996);

        film1.stampa();

        Reziser reziser1 = new Reziser();
        reziser1.setImeIPrezime("Dzejms Kameron");
        reziser1.setStarost(66);

        reziser1.stampaj();

    }
}
