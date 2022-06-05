package p_03_06_2022_Atleticar;

public class Main {
    public static void main(String[] args) {
        Disciplina skok = new Disciplina("skok u dalj", "skakacka");
        Disciplina prepone = new Disciplina("110m sa preponama", "trkacka");

        Skakac s = new Skakac("Aca", 5.6);
        Skakac l = new Skakac("Filip", 6.7);
        Trkac t = new Trkac("Joca", 15);
        Trkac q = new Trkac("Lida", 14);

        skok.dodajAtleticara(s);
        skok.dodajAtleticara(l);
        s.boljiJe(l);


    }
}
