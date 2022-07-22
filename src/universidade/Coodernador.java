package src.universidade;

public class Coodernador extends  Funcionario{

    int quantProfessor;
    int  addProf;
    int  totalProf;

    double aumentoCood;
    double comAumentoCood;

    public Coodernador(String nome, int cpf, int numerDeRegistro, String orgaoDeLotacao, double salario, int quantProfessor, int addProf, int totalProf, double aumentoCood, double comAumentoCood) {
        super(nome, cpf, numerDeRegistro, orgaoDeLotacao, salario);
        this.quantProfessor = quantProfessor;
        this.addProf = addProf;
        this.totalProf = totalProf;
        this.aumentoCood = aumentoCood;
        this.comAumentoCood = comAumentoCood;
    }

    //// metodo de reajuste salárial//
    public void  reajusteCood (double aumentoCood, double comAumentoCood ){
        comAumentoCood = ((getSalario() * aumentoCood)+getSalario());
        System.out.println("Seu salário atual é de  "+comAumentoCood + "após do aumento de 5%");

    }

    /// metodo de adicionar professores e também mostra quantidade total de professores na sua equipe///
    public void adicionarProfessor (int addProf, int quantProfessore) {
        totalProf = quantProfessore + addProf;
        System.out.println("Foram adicionado mais  "  + addProf +  "   Professores na sua equipe, o total é de  "+ totalProf );
    }
    public int getQuantProfessor() {
        return quantProfessor;
    }

    public void setQuantProfessor(int quantProfessor) {
        this.quantProfessor = quantProfessor;
    }

    public int getAddProf() {
        return addProf;
    }

    public void setAddProf(int addProf) {
        this.addProf = addProf;
    }

    public int getTotalProf() {
        return totalProf;
    }

    public void setTotalProf(int totalProf) {
        this.totalProf = totalProf;
    }

}

