package d_18_05_2022;

public class SmartAirConditioning {
    public String marka;
    public int temperatura;
    public String mod;
    public int potrosnjaDokHladi;
    public int potrosnjaDokGreje;

    public SmartAirConditioning () {

    }
    public SmartAirConditioning(String marka, int temperatura, String mod, int potrosnjaDokHladi, int potrosnjaDokGreje) {
        this.marka = marka;
        this.temperatura = temperatura;
        this.mod = mod;
        this.potrosnjaDokHladi = potrosnjaDokHladi;
        this.potrosnjaDokGreje = potrosnjaDokGreje;
    }

    public void stampa() {
        System.out.println(marka);
        System.out.println(mod);
        System.out.println(temperatura);
    }

    public int mesecnaPotrosnja ()
    {int potrosnja;
        if (mod.equals("greje")) {
        potrosnja = 30*15*potrosnjaDokGreje;}
        else potrosnja = 30*15*potrosnjaDokHladi;
    return potrosnja;
    }
}
