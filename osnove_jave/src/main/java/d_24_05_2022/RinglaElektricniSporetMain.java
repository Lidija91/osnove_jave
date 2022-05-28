package d_24_05_2022;

public class RinglaElektricniSporetMain {
    public static void main(String[] args) {
       Ringla jedan = new Ringla("obican", 2, 4);
        Ringla dva = new Ringla("obican", 3, 6);
        Ringla tri = new Ringla("obican", 4, 8);
        Ringla cetiri = new Ringla("obican", 2, 4);

        ElektricniSporet gorenje = new ElektricniSporet("Gorenje", 7, 4,jedan,dva,tri, cetiri);
        gorenje.stampa();
    }
}
