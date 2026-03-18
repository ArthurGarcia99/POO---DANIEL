import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    // agregação
    public void matricularAluno(Aluno a){
        this.alunos.add(a);
        System.out.println("Aluno matriculado com sucesso.");
    }

    // composição
    public void criarAvaliacao(int id, String nome){
        Avaliacao aux = new Avaliacao(id, nome);
        this.avaliacoes.add(aux);
        System.out.println("Avaliação criada com sucesso.");
    }

    public Disciplina() {
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "Disciplina: " +
                " ID = " + id +
                ", NOME = " + nome +
                ", PROFESSOR = " + professor +
                "\nALUNOS = " + alunos +
                "\nAVALIAÇÕES = " + avaliacoes;
    }
}
