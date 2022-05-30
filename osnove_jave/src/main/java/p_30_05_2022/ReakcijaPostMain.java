package p_30_05_2022;

public class ReakcijaPostMain {
    public static void main(String[] args) {

        FacebookPost prvi = new FacebookPost("Srki", "cao cao");
        FacebookPost drugi = new FacebookPost("Leka", "Djole peva");

        Reakcija jedan = new Reakcija("smajli", "Lida M");
        Reakcija dva = new Reakcija("like", "Ksenija M");

        prvi.reaguj(jedan);
        prvi.reaguj(new Reakcija("smajli", "N n"));
        prvi.reaguj(new Reakcija("smajli", "N n"));
        prvi.reaguj(new Reakcija("like", "N n"));

        prvi.stampaj();

    }
}
