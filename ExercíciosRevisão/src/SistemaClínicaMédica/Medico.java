package SistemaClínicaMédica;

public class Medico{
    private int id;
    private String nome, especialidade;

    public Medico() {
    }

    public Medico(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", especialidade='" + this.especialidade + '\'' +
                '}';
    }
}