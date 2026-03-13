public class Aluno{
    private int id, ra;
    private String nome;

    public Aluno() {
    }

    public Aluno(int id, int ra, String nome) {
        this.id = id;
        this.ra = ra;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public int getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nAluno: " +
                " ID = " + id +
                ", RA = " + ra +
                ", NOME = " + nome;
    }
}