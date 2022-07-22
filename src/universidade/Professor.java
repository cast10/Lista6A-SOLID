package src.universidade;

public class Professor extends  Funcionario{

    String nivelDeGraduacao;
    String disciplinaMinistrada;
    int quantAlunos;
    int quantTurma=10;
    int addEstagiario=-2;
    int quantEstagiario;
    int totaDeEstagiarios;
    double aumento10;

    int addTurma;
    int totalDeTurma;

    public Professor(String nome, int cpf, int numerDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int quantAlunos, int quantTurma, double aumento10) {
        super(nome, cpf, numerDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantAlunos = quantAlunos;
        this.quantTurma = quantTurma;
        this.aumento10 = aumento10;
    }
    //// metodo de reajuste salárial//
    public void reajusteProf(double aumento10, double comAumentProf){
        comAumentProf = ((getSalario() * aumento10)+getSalario());
        System.out.println("Seu salário atual é de  "+comAumentProf + "após do aumento de 10%");

    }/// metodo de adicionar nova turma e também mostra quantidade total de turmas///
    public void adicionarTurma(int quantTurma, int addTurma){
        totalDeTurma = (quantTurma + addTurma);
        System.out.println("Quantidade de turma é de   " + totalDeTurma);

    }/// metodo de adicionar estágiario e também mostra quantidade total de estagiários na sua equipe///

    public void adicionarEstagiario(int quantEstagiario, int addEstagiario){
        totaDeEstagiarios=(quantEstagiario +addEstagiario );
        System.out.println("Foi adicionado   "  +totaDeEstagiarios  + "  estágiario(s)");
        if (totaDeEstagiarios >3 ) {
            System.out.println("O professor não pode ter mais que 2 estagiários por favor procurar a administração" );

        }

    }
    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public int getQuantTurma() {
        return quantTurma;
    }

    public void setQuantTurma(int quantTurma) {
        this.quantTurma = quantTurma;
    }

}
