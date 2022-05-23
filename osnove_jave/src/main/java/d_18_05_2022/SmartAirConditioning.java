package d_18_05_2022;

public class SmartAirConditioning {
    public String marka;
    public int temperatura;
    public String mod;


    public void stampa () {
        if (temperatura>=16 && temperatura<=35 && mod.equals("hladi") || mod.equals("greje"))
            System.out.println(marka);
        System.out.println(temperatura);
        System.out.println(mod);
    }

}
