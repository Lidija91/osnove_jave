package p_30_05_2022;

import java.util.ArrayList;

public class FacebookPost {
    private String imeOnogKojiJeIzbacioPost;
    private String tekst;
    private ArrayList<Reakcija> nizReakcija = new ArrayList<>();


    public FacebookPost(String imeOnogKojiJePostovao, String tekst) {
        this.imeOnogKojiJeIzbacioPost = imeOnogKojiJePostovao;
        this.tekst = tekst;
    }

    public String getImeOnogKojiJeIzbacioPost() {
        return imeOnogKojiJeIzbacioPost;
    }

    public void setImeOnogKojiJeIzbacioPost(String imeOnogKojiJeIzbacioPost) {
        this.imeOnogKojiJeIzbacioPost = imeOnogKojiJeIzbacioPost;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public void reaguj(Reakcija reakcija) {
        for (int i = 0; i < nizReakcija.size(); i++) {
            if (nizReakcija.get(i).getImeIPrezime().equals(reakcija.getImeIPrezime())) {
                nizReakcija.remove(i);
            }
        }
        this.nizReakcija.add(reakcija);
    }

    private int brojReakcija(String tip) {
        int brojac = 0;
        for (int i = 0; i < nizReakcija.size(); i++) {
            if (tip.equals(nizReakcija.get(i).getTip())) {
                brojac = brojac + 1;
            }

        }
        return brojac;
    }

    public void stampaj() {
        System.out.println(imeOnogKojiJeIzbacioPost);
        System.out.println(tekst);
        System.out.print("Smajli " + brojReakcija("smajli"));
        System.out.print("| Like " + brojReakcija("like"));
        System.out.print("| Srce " + brojReakcija("srce"));


    }

}
