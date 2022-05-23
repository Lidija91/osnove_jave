package d_18_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {

        SmartAirConditioning prvaKlima = new SmartAirConditioning();
        prvaKlima.marka = "Samsung";
        prvaKlima.temperatura = 20;
        prvaKlima.mod = "hladi";

        prvaKlima.stampa();

        SmartAirConditioning drugaKlima = new SmartAirConditioning();
        drugaKlima.marka = "Galanz";
        drugaKlima.temperatura = 30;
        drugaKlima.mod = "greje";
        drugaKlima.stampa();
    }
}
