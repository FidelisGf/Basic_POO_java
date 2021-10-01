import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        menuDoAluno();
    }
    public static void menuDoAluno(){
        Turma turma = new Turma();
        Aluno_Controller ac = new Aluno_Controller();
        Turma_Controller tc = new Turma_Controller();
        int op = 0;
        Scanner le = new Scanner(System.in);
        while(true){
            System.out.printf("Selecione uma opção abaixo !\n\n");
            System.out.printf("|||||    [1]Cadastrar Nova Turma    |||||\n\n");
            System.out.printf("|||||    [2]Cadastrar Novo Aluno    |||||\n\n");
            System.out.printf("|||||    [3]Desativar Turma         |||||\n\n");
            System.out.printf("|||||    [4]Ativar Turma            |||||\n\n");
            System.out.printf("|||||    [5]Sair                    |||||\n\n");
            op = le.nextInt();
            switch (op){
                case 1:
                    tc.creatTurma(turma);
                    break;
                case 2:
                    ac.criarAluno(turma);
                    mostraTurma(turma);
                    break;
                case 5:
                    break;
            }
        }


    }
    public static  void mostraTurma(Turma turma){
        String tmp = null;
        int h = 0;
        System.out.println("Os Alunos da Turma  " + turma.getNome() + " são :");
        for(int i = 0; i < turma.getList().size(); i++){
            System.out.println("||||    " + i + " Aluno : " + turma.getList().get(i).getNomeAluno(tmp) + "  com a Idade de: " + turma.getList().get(i).getIdadeAluno(tmp) + "anos   ||||");
        }
    }
}
