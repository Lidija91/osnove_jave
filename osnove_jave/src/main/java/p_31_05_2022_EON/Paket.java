package p_31_05_2022_EON;

public class Paket {
    protected String naziv;
    protected String imeIPrezime;
    protected int mesecnaCena;
    protected int ugovornaObaveza;
    protected int brzinaZaDownload;
    protected int brzinaZaUpload;

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setMesecnaCena(int mesecnaCena) {
        this.mesecnaCena = mesecnaCena;
    }

    public void setUgovornaObaveza(int ugovornaObaveza) {
        this.ugovornaObaveza = ugovornaObaveza;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getMesecnaCena() {
        return mesecnaCena;
    }

    public int getUgovornaObaveza() {
        return ugovornaObaveza;
    }

    public int getBrzinaZaDownload() {
        return brzinaZaDownload;
    }

    public int getBrzinaZaUpload() {
        return brzinaZaUpload;
    }

    public void produziUgovor() {
        ugovornaObaveza = ugovornaObaveza + 12;
    }

    public int brMeseciPoDinar() {
        return 0;
    }

    public void stampaj() {
        System.out.println(this.naziv + " - " + this.brzinaZaDownload + "/"
                + this.brzinaZaUpload + " - " + this.ugovornaObaveza);
        System.out.println(this.mesecnaCena);
    }
}
