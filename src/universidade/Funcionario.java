package src.universidade;

public class Funcionario implements Reembolso {


    String nome;
    int cpf;
    int numerDeRegistro;
    String orgaoDeLotacao;
    double salario;
    double reembolso;



    public Funcionario(String nome, int cpf, int numerDeRegistro, String orgaoDeLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numerDeRegistro = numerDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getNumerDeRegistro() {
        return numerDeRegistro;
    }

    public void setNumerDeRegistro(int numerDeRegistro) {
        this.numerDeRegistro = numerDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void reembolsoDeGastos() {
    }
}

