package test_java;

public class Zadatak4 {
    public static void main(String[] args) {
        double x = duzina(3.5, "km");
        System.out.println(x);
        x = duzina(3.5, "dm");
        System.out.println(x);
        x = duzina(3.5, "cm");
        System.out.println(x);
    }

    static double duzina(double metar, String jedinica) {

        if (jedinica == "cm") {
            metar = metar * 100;
        } else if (jedinica == "dm") {
            metar = metar * 10;
        } else if (jedinica == "km") {
            metar = metar * 0.001;
        }
        return metar;
    }
}
