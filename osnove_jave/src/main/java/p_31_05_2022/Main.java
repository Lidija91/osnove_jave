package p_31_05_2022;

public class Main {
    public static void main(String[] args) {
        Student Leka = new Student("Marko Lekovic", "1234567891011", "2010m",50000);
        Student Laza = new Student("Lazar Mijailovic", "205050560606", "2010a", 10000);

        Profesor Bataveljic = new Profesor("Mirko B", "123456789","sociologija", 100000 );
        Profesor Ljilja = new Profesor("Ljiljana Jelic", "2904880558080", "matematika", 120000);

        Leka.stampaj();
        Leka.uplatiSkolarinu(200000);
        Leka.stampaj();

        Bataveljic.stampaj();
        Bataveljic.povecajPlatu(5);
        Bataveljic.stampaj();

    }
}
