package d_24_05_2022;

public class Ringla {
    private String tip;
    private int jacina;
    private double jacinaGrejaca;

    public Ringla(String tip, int jacina, double jacinaGrejaca) {
        this.tip = tip;
        this.jacina = 0;
        this.jacinaGrejaca = jacinaGrejaca;
    }


    public int getJacina() {
        return jacina;
    }

    private int maxBrPojacavanja() {
        if (tip.equals("obicna")) {
            return 3;
        } else if (tip.equals("ekspres")) {
            return 12;
        }
        return 0;
    }

    public void pojacajRinglu() {
        if (maxBrPojacavanja() > jacina) {
            jacina = jacina + 1;
        }
    }
    public void iskljuciRinglu () {
        jacina=0;
    }
    public boolean ukljucenaJe () {
        return jacina > 0;
    }
    public double potrosnjaElEnergije (double satiRada){
        return 100/maxBrPojacavanja()*jacina*jacinaGrejaca*satiRada;
    }
    public void stampaj () {
        if (ukljucenaJe()) {
            System.out.println("Ringla je ukljucena.");
        } else System.out.println("Ringla je iskljucena.");
        System.out.println("Tip ringle: " + this.tip);
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Grejac: " + jacinaGrejaca + " kW");
    }



}
