package d_24_05_2022;

public class RacunTransakcijaMain {
    public static void main(String[] args) {

        Racun prvi = new Racun("170-258258-65", "Lida", 10000);

        Racun drugi = new Racun("200-20558-65", "Aleksandar", 200);


        prvi.menjajStanje(500);
        System.out.println(prvi.getTrenutnoStanje());
    }
}
