import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Turma {
    private String nome;
    private int Nalunos;
    private boolean ativo;
    private List<Aluno> list = new ArrayList<Aluno>();
    Turma(){

    }
    public Turma(String nome, int nalunos, boolean ativo, List<Aluno> list) {
        this.nome = nome;
        Nalunos = nalunos;
        this.ativo = ativo;
        this.list = list;
    }
    public Turma(String nome, int nalunos, boolean ativo) {
        this.nome = nome;
        Nalunos = nalunos;
        this.ativo = ativo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNalunos() {
        return Nalunos;
    }

    public void setNalunos(int nalunos) {
        Nalunos = nalunos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Aluno> getList() {
        return list;
    }

    public void setList(List<Aluno> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", Nalunos=" + Nalunos +
                ", ativo=" + ativo +
                ", list=" + list +
                '}';
    }

}
