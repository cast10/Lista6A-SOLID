package src.universidade;

public class Turma {

        String exatas;
        int alunosPorTurma;
        int turmaQuant;



    public Turma(String exatas, int alunosPorTurma, int turmaQuant) {
        this.exatas = exatas;
        this.alunosPorTurma = alunosPorTurma;
        this.turmaQuant = turmaQuant;

    }

    public String getExatas() {
        return exatas;
    }

    public void setExatas(String exatas) {
        this.exatas = exatas;
    }

    public int getAlunosPorTurma() {
        return alunosPorTurma;
    }

    public void setAlunosPorTurma(int alunosPorTurma) {
        this.alunosPorTurma = alunosPorTurma;
    }

    public int getTurmaQuant() {
        return turmaQuant;
    }

    public void setTurmaQuant(int turmaQuant) {
        this.turmaQuant = turmaQuant;
    }

}

