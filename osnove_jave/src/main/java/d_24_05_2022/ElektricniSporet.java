package d_24_05_2022;

public class ElektricniSporet {
    private String marka;
    private int brojGodina;
    private int maxBrojUkljucenihRingli;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;

    public ElektricniSporet(String marka, int brojGodina, int maxBrojUkljucenihRingli, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.marka = marka;
        this.brojGodina = brojGodina;
        this.maxBrojUkljucenihRingli = maxBrojUkljucenihRingli;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }

    public String getMarka() {
        return marka;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public int getMaxBrojUkljucenihRingli() {
        return maxBrojUkljucenihRingli;
    }

    public Ringla getGoreLevo() {
        return goreLevo;
    }

    public Ringla getGoreDesno() {
        return goreDesno;
    }

    public Ringla getDoleLevo() {
        return doleLevo;
    }

    public Ringla getDoleDesno() {
        return doleDesno;
    }

    public void pojacaj(int pozicijaRingle) {
        if (proveraUkljucenihRingli() == maxBrojUkljucenihRingli) {
            ugasiSveRingle();
        }
        if (pozicijaRingle == 1) {
            goreLevo.pojacajRinglu();
        } else if (pozicijaRingle == 2) {
            goreDesno.pojacajRinglu();
        } else if (pozicijaRingle == 3) {
            doleLevo.pojacajRinglu();
        } else if (pozicijaRingle == 4) {
            doleDesno.pojacajRinglu();
        }

    }

    public int proveraUkljucenihRingli() {
        int brojUkljucenihRingli = 0;
        if (goreLevo.ukljucenaJe()) {
            brojUkljucenihRingli = brojUkljucenihRingli + 1;
        } else if (goreDesno.ukljucenaJe()) {
            brojUkljucenihRingli = brojUkljucenihRingli + 1;
        } else if (doleLevo.ukljucenaJe()) {
            brojUkljucenihRingli = brojUkljucenihRingli + 1;
        } else if (doleDesno.ukljucenaJe()) {
            brojUkljucenihRingli = brojUkljucenihRingli + 1;
        }
        return brojUkljucenihRingli;
    }

    public void ugasiSveRingle() {
        goreLevo.iskljuciRinglu();
        goreDesno.iskljuciRinglu();
        doleLevo.iskljuciRinglu();
        doleDesno.iskljuciRinglu();
    }


    public void gasenjeRingle(int pozicijaRingle) {
        if (pozicijaRingle == 1) {
            goreLevo.iskljuciRinglu();
        } else if (pozicijaRingle == 2) {
            goreDesno.iskljuciRinglu();
        } else if (pozicijaRingle == 3) {
            doleLevo.iskljuciRinglu();
        } else if (pozicijaRingle == 4) {
            doleDesno.iskljuciRinglu();
        }
    }
    public void stampa () {
        System.out.println(marka+brojGodina);
    }

}
