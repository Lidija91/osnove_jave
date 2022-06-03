package p_02_06_2022_Figura;

public class JednakostranicniTrougao extends Figura{

    private int stranicaA;

    public JednakostranicniTrougao(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    public int getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    @Override
    public double povrsina() {
        return stranicaA*stranicaA*1.73205/4;
    }

    @Override
    public double obim() {
        return stranicaA*3;
    }

}
