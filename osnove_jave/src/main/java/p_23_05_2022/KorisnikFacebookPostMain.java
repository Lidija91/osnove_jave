package p_23_05_2022.p_23_05_2022;

public class KorisnikFacebookPostMain {
    public static void main(String[] args) {

        Korisnik korisnik1 = new Korisnik();
        korisnik1.setPrezime("Ivanovic");
        korisnik1.setIme("Jovana");

        FacebookPost prvi = new FacebookPost();
        prvi.setOpis("NEsto");
        prvi.setAutorPosta("Petar Petrovic");
        prvi.setKorisnik(korisnik1);


        prvi.stampaj();

    }
}
