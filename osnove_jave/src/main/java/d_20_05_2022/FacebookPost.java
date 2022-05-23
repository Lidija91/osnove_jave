package d_20_05_2022;

public class FacebookPost {
    public String koJeObjavio;
    public String profilKorisnika;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;

    public FacebookPost() {
    }

    public FacebookPost(String koJeObjavio, String profilKorisnika, String tekstObjave) {
        this.koJeObjavio = koJeObjavio;
        this.profilKorisnika = profilKorisnika;
        this.tekstObjave = tekstObjave;
    }

    public void like() {
        brojLajkova = brojLajkova + 1;
    }

    public void dislike() {
        if (brojLajkova > 1) {
            brojLajkova = brojLajkova - 1;
        }
    }

    public void share() {
        brojDeljenja = brojDeljenja + 1;
    }
    public void print () {
        System.out.println(koJeObjavio + " >>> " + profilKorisnika);
        System.out.println(tekstObjave);
        System.out.println("Likes " + brojLajkova + "| Shares " + brojDeljenja);
    }

}
