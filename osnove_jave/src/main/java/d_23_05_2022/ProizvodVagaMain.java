package d_23_05_2022;

public class ProizvodVagaMain {
    public static void main(String[] args) {


        Proizvod tresnje = new Proizvod("207", "tresnja", 200);
        Vaga libra = new Vaga();
        libra.setMernaJedinica("kg");
        libra.setProizvod(tresnje);

        libra.stampaj(100, "kg");
    }
}
