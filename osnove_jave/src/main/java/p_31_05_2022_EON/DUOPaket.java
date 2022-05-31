package p_31_05_2022_EON;

public class DUOPaket extends Paket {
    private String dodatniUredjaj;

    public DUOPaket(String imeIPrezime, int mesecnaCena, int ugovornaObaveza) {
        this.imeIPrezime = imeIPrezime;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
        this.naziv = "EON FULL DUO";
        this.brzinaZaDownload = 250;
        this.brzinaZaUpload = 100;
    }

    @Override
    public int brMeseciPoDinar() {
        return 6;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setBrzinaZaDownload(int brzinaZaDownload) {
        this.brzinaZaDownload = 250;
    }

    public void setBrzinaZaUpload(int brzinaZaUpload) {
        this.brzinaZaUpload = 100;
    }

    public void povecanjeBrzine(int uvecanje) {
        this.brzinaZaDownload = brzinaZaDownload + uvecanje;
        this.brzinaZaUpload = brzinaZaUpload + uvecanje;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println(" + broj meseci za dinar: " + brMeseciPoDinar());
    }


}
