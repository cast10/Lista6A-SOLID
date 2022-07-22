package src.universidade;


public  class Admistracao extends Funcionario {

    String funcaoADM;
    String serioridade;
    double aumentoDe10;
    double comAumentAdm;


    public Admistracao(String nome, int cpf, int numerDeRegistro, String orgaoDeLotacao, double salario, String funcaoADM, String serioridade, double aumentoDe10, double comAumentAdm) {
        super(nome, cpf, numerDeRegistro, orgaoDeLotacao, salario);
        this.funcaoADM = funcaoADM;
        this.serioridade = serioridade;
        this.aumentoDe10 = aumentoDe10;
        this.comAumentAdm = comAumentAdm;
    }
    /// metodo de reajuste salárial//
    public void reajusteAdm(double aumentoDe10, double comAumentAdm ){
        comAumentAdm = ((getSalario() * aumentoDe10)+getSalario());
        System.out.println("Seu salário atual é de  "+comAumentAdm + " após do aumento de 10%");

    }


    public String getFuncaoADM() {
        return funcaoADM;
    }

    public void setFuncaoADM(String funcaoADM) {
        this.funcaoADM = funcaoADM;
    }

    public String getSerioridade() {
        return serioridade;
    }

    public void setSerioridade(String serioridade) {
        this.serioridade = serioridade;
    }

    public double getAumentoDe10() {
        return aumentoDe10;
    }

    public void setAumentoDe10(double aumentoDe10) {
        this.aumentoDe10 = aumentoDe10;
    }

}
