package src.universidade;

public class Estagiario implements Reembolso {

    String  nome;
    double bolsa;
    String disciplina;


    public Estagiario(String nome, double bolsa, String disciplina) {
        this.nome = nome;
        this.bolsa = bolsa;
        this.disciplina = disciplina;
    }

    @Override
    public void reembolsoDeGastos() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

