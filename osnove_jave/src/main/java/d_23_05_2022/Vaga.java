package d_23_05_2022;

public class Vaga {
    private String mernaJedinica;
    private Proizvod proizvod;

    public Vaga() {
    }

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public double sracunajCenu(double tezina) {
        if (mernaJedinica.equals("kg")) {
            return proizvod.getCenaKg() * tezina;
        } else if (mernaJedinica.equals("lb")) {
            return proizvod.getCenaLb() * tezina;
        }
        return 0;
    }

    public void stampaj(double tezina, String mernaJedinica) {
        String sifra = proizvod.getSifra();
        String naziv = proizvod.getNaziv();
        System.out.println(sifra + " - " + naziv);
        if (mernaJedinica.equals("kg")) {
            double cenaPoKg = proizvod.getCenaKg();
            System.out.print(cenaPoKg);
        } else {
            double cenaPoLb = proizvod.getCenaLb();
            System.out.print(cenaPoLb);
        }
        System.out.println(" " + mernaJedinica + " x " + tezina);

        System.out.print("Ukupno ");


    }
}
