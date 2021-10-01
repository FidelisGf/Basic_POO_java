public class Aluno {
    private String nomeAluno;
    private String idadeAluno;

    Aluno(){

    }

    public Aluno(String nomeAluno, String idadeAluno) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
    }

    public String getNomeAluno(String nome) {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getIdadeAluno(String idade) {
        return idadeAluno;
    }

    public void setIdadeAluno(String idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", idadeAluno=" + idadeAluno +
                '}';
    }

}
