package d_23_05_2022;

public class AutorKnjigaMain {
    public static void main(String[] args) {

        Autor Ksenija = new Autor("Ksenija", "Milivojevic");
        Autor Svedjanin = new Autor("Fredrik", "Bakman");
        Knjiga Uve = new Knjiga("123", "Covek po imenu Uve", 2010, Svedjanin);
        Ksenija.stampa();
        Uve.stampa();
    }
}
