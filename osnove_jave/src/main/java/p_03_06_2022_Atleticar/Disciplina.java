package p_03_06_2022_Atleticar;

import java.util.ArrayList;

public class Disciplina {
    private String disciplina;
    private String tipDiscipline;
    ArrayList<Atleticar> nizAtleticara = new ArrayList<>();

    public Disciplina(String disciplina, String tipDiscipline, ArrayList<Atleticar> nizAtleticara) {
        this.disciplina = disciplina;
        this.tipDiscipline = tipDiscipline;
        this.nizAtleticara = nizAtleticara;
    }

    public Disciplina(String disciplina, String tipDiscipline) {
        this.disciplina = disciplina;
        this.tipDiscipline = tipDiscipline;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public ArrayList<Atleticar> getNizAtleticara() {
        return nizAtleticara;
    }

    public void setNizAtleticara(ArrayList<Atleticar> nizAtleticara) {
        this.nizAtleticara = nizAtleticara;
    }

    public void dodajAtleticara(Atleticar b) {
        nizAtleticara.add(b);
    }

    public void diskvalifikuj(String imeAtleticara) {
        for (int i = 0; i < nizAtleticara.size(); i++) {
            if (nizAtleticara.get(i).getImeIPrezime().equals(imeAtleticara)) {
                nizAtleticara.remove(i);
            }
        }
    }

}



