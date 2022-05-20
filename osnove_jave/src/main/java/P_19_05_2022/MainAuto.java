package P_19_05_2022;

public class MainAuto {
    public static void main(String[] args) {
        Auto Auto1 = new Auto();
        Auto1.imeIPrezime = "Lidija Milivojevic";
        Auto1.marka = "Opel";
        Auto1.brojVrata = 5;
        Auto1.potrosnja = 7;
        Auto1.brzina = 130;
        Auto1.brojRegistracije = "KG130LS";
        Auto1.daLiJeUkljucenaKlima = true;
        Auto1.godinaProizvodnje = 2011;
        Auto1.mesecRegistracije = 8;
        Auto1.kubikaza = 3000;

        Auto Auto2 = new Auto();
        Auto2.imeIPrezime = "Jovan Jovanovic";
        Auto2.marka = "Volkswagen";
        Auto2.brojVrata = 4;
        Auto2.potrosnja = 10;
        Auto2.brzina = 200;
        Auto2.brojRegistracije = "KG144PL";
        Auto2.daLiJeUkljucenaKlima = true;

        Auto1.stampa();
        System.out.println();
        Auto2.stampa();
        if (Auto1.daLiJePrekoracioBrzinu(128) == true) {
            System.out.println("Brzina je prekoračena.");
        } else {
            System.out.println("Niste prekoračili brzinu.");
        }
        int visinaKazne = Auto1.kazna(128);
        System.out.println("Visina kazne je " + visinaKazne + " rsd.");

        Auto1.dodajGas();
        {
            System.out.println(Auto1.brzina);
        }
        Auto1.koci();
        {
            System.out.println(Auto1.brzina);
        }

        System.out.println(Auto1.potrosnja());

        if (Auto1.oldtimer()) {
            System.out.println("Auto je oldtimer.");
        }
        else System.out.println("Auto nije oldtimer.");

        if (Auto1.isteklaRegistracija(5)) {
            System.out.println("Registracija je istekla.");
        }
        else System.out.println("Nije istekla registracija.");

       double cenaRegistracije = Auto1.cenaRegistracije();
        System.out.println("Cena registracije je " + cenaRegistracije + " rsd.");
    }
}
