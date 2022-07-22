package src.universidade;

public class Main {

    public static void main(String[] args) {

        //criação do novo objeto funcionário ///
        System.out.println("Functionary");
        Funcionario F1 = new Funcionario("Yudi",7474447, 747474, "Prof", 1000);
        System.out.println();
        System.out.println("Dados do funcionário ");
        System.out.println();
        System.out.println(" Nome      " + F1.getNome());
        System.out.println(" CPF       " + F1.getCpf());
        System.out.println(" Registro  " + F1.getNumerDeRegistro());
        System.out.println(" Orgão     " + F1.getOrgaoDeLotacao());
        System.out.println(" Salário   " + F1.getSalario());
        System.out.println();
        /// //criação do novo objeto para calcular salário e adicionar  (Clasee Coodernador)//

        System.out.println("Cooddernador");
        System.out.println();
        Coodernador c1 = new Coodernador("Joao", 7474,4444,"CLT", 5000, 5, 1,6,0.05,5000);
        c1.reajusteCood(0.05, 5000);
        System.out.println();
        c1.adicionarProfessor(2,5);

        System.out.println();
        /// //criação do novo objeto para calcular salário  //

        System.out.println("Adimistração");
        System.out.println();
        Admistracao adm1= new Admistracao("Jose",7,11,"CLT", 1000, "Secretário", "não sei", 0.10, 444);
        adm1.reajusteAdm(0.10, 4000);
        System.out.println();

        System.out.println("Professor");
        System.out.println();

        Professor p1 = new Professor("Maria",748574, 74485, "CLT",1500, "Pos", "Matematica", 20, 4, 1);
        p1.reajusteProf(0.10, 1000);
        p1.adicionarTurma(4, 2);
        p1.adicionarEstagiario(0, 2);


        System.out.println();
        /// //um nono estágiari
        System.out.println("Estagiário");
        System.out.println();
        Estagiario e1= new Estagiario("Zelia", 500, "matematica");
        System.out.println("Nome "        +e1.getNome());
        System.out.println("Disciplina "  +e1.getDisciplina());
        System.out.println("Bolsa "       +e1.getBolsa());

        System.out.println();
        /// nova turma//
        System.out.println("Turma");
        System.out.println();

        Turma t1 = new Turma("Fisica",20,1);
        System.out.println("Matéria   "      + t1.getExatas() );
        System.out.println("Quantidade  "   + t1.getAlunosPorTurma());
        System.out.println("Turma       "    + t1.getTurmaQuant());

    }

}
