package p_24_05_2022;

public class KorisnikZoomCallMain {
    public static void main(String[] args) {

        Korisnik prvi = new Korisnik("Lidija Milivojevic");

        Korisnik drugi = new Korisnik("Jovan J");
        ZoomCall bootCamp = new ZoomCall("nesto", "123456", prvi, drugi);

        prvi.pretplatiSe(150);
//        prvi.ponistiPretplatu();
//        System.out.println(prvi.getTip());


        bootCamp.pokreniPoziv();


    }
}
