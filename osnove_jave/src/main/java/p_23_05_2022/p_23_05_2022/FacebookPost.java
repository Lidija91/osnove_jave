package p_23_05_2022.p_23_05_2022;

public class FacebookPost {

    private String opis;
    private String autorPosta;
    private Korisnik korisnik;

    public FacebookPost () {}

    public FacebookPost (String opis, String autorPosta) {
        this.opis=opis;
        this.autorPosta=autorPosta;
    }
    public String getOpis ()
    {return this.opis;}
    public void setOpis (String opis) {
        this.opis=opis;
    }
    public String getAutorPosta ()
    {return this.autorPosta;}
    public void setAutorPosta (String autorPosta) {
        this.autorPosta=autorPosta;
    }
    public Korisnik getKorisnik()
    {return this.korisnik;}
    public void setKorisnik (Korisnik korisnik) {
        this.korisnik=korisnik;
    }
    public void stampaj () {
        this.korisnik.stampaj();
        System.out.println(this.opis);
    }

}
