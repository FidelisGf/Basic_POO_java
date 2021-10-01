import  java.util.*;
public class Aluno_Controller {
    private Turma turma = new Turma();
    private Turma_Controller tc = new Turma_Controller();
    String nome;
    String idade;
    Aluno aluno = new Aluno();
    Scanner le = new Scanner(System.in);
    private List<Aluno> lista = new ArrayList<Aluno>();
    public List<Aluno> getLista() {
        return lista;
    }
    public void setLista(List<Aluno> lista) {
        this.lista = lista;
    }
    void criarAluno(Turma turma){
        int op = 0;
        while (true){
            System.out.println("Vamos criar um aluno :");
            System.out.println("Insira o nome do aluno ");
            nome = le.nextLine();
            System.out.println("Insira a idade do aluno");
            idade = le.nextLine();
            aluno.setNomeAluno(nome);
            aluno.setIdadeAluno(idade);
            Aluno aluno = new Aluno(nome, idade);
            tc.addaluno(turma, nome, idade);
            System.out.println();
            System.out.println("Deseja continuar ? [1] Sim  [2] Nao");
            op = le.nextInt();
            le.nextLine();
            pula_linha();
            if(op == 2){
                break;
            }
        }
    }
    void pula_linha(){
        for(int i = 0; i < 45; i++){
            System.out.println();
        }
    }
}
