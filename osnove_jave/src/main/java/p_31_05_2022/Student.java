package p_31_05_2022;

public class Student extends Osoba {
    private String brojIndexa;
    private int dugZaSkolarinu;

    public Student(String imeIPrezime, String jmbg, String brojIndexa, int dugZaSkolarinu) {
        super(imeIPrezime, jmbg);
        this.brojIndexa = brojIndexa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }
    public void uplatiSkolarinu (int uplaceno) {
        dugZaSkolarinu=dugZaSkolarinu-uplaceno;
        if (dugZaSkolarinu<0) {dugZaSkolarinu=0;}
    }
    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println("Index: " + brojIndexa + ", " + "dug za skolarinu: "+dugZaSkolarinu);
    }
}
