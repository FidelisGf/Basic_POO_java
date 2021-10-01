import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turma_Controller {
    private Turma turma = new Turma();
    Scanner le = new Scanner(System.in);
    int opcao = 0;

    void addaluno(Turma turma, String nome, String idade){
            System.out.println("Aluno adicionado a turma : " + turma.getNome());
            Aluno aluno = new Aluno(nome, idade);
            turma.getList().add(aluno);

    }
    void creatTurma(Turma turma){
        System.out.println("Insira o nome da turma : ");
        String tmp = le.nextLine();
        turma.setNome(tmp);
        System.out.println("Insira o numero de aluno maximo nessa turma");
        int tmp2 = le.nextInt();
        turma.setNalunos(tmp2);
        le.nextLine();
        turma.setAtivo(true);
    }
}
