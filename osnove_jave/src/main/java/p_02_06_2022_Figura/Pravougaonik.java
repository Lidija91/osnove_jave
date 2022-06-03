package p_02_06_2022_Figura;

public class Pravougaonik extends Figura {
    private int a;
    private int b;

    public Pravougaonik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a*b;
    }

    @Override
    public double obim() {
        return 2*a+2*b;
    }
}
