package p_31_05_2022_EON;

public class EONPaket extends Paket {

    public EONPaket (String imeIPrezime, int mesecnaCena, int ugovornaObaveza) {
        this.imeIPrezime=imeIPrezime;
        this.mesecnaCena=mesecnaCena;
        this.ugovornaObaveza=ugovornaObaveza;
        this.naziv="EON LIGHT DUO";
        this.brzinaZaDownload=150;
        this.brzinaZaUpload=75;
    }
    @Override
    public int brMeseciPoDinar() {
        return 3;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println(" + broj meseci za dinar: " + brMeseciPoDinar());
    }



}
