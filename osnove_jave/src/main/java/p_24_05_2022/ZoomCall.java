package p_24_05_2022.p_24_05_2022;

public class ZoomCall {

    private String linkZaPoziv;
    private String password;
    private Korisnik host;
    private Korisnik guest;


    public String getLinkZaPoziv() {
        return linkZaPoziv;
    }

    public ZoomCall(String linkZaPoziv, String password, Korisnik host, Korisnik guest) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void pokreniPoziv() {
        System.out.println("Zoom Call: " + this.linkZaPoziv);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.getHost().getImeIPrezime());
        System.out.println("Guest: " + this.getGuest().getImeIPrezime());
        System.out.println("Maximalno trajanje poziva je " + this.host.maxDuzina() + "min");
    }

}
