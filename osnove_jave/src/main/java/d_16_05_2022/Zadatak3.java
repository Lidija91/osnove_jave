package d_16_05_2022;

public class Zadatak3 {
    public static void main(String[] args) {
//        Zadatak
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

        osnovniPodaci("2904991720000", "Lidija", "Milivojevic", 1991, true);
    }

    static void osnovniPodaci(String jmbg, String ime, String prezime, int godinaRodjenja, boolean daLiJeAktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God.rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + daLiJeAktivan);
    }


}
