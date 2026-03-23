package SistemaClínicaMédica;

public class Paciente {
    private int id;
    private String nome, cpf;

    public Paciente() {
    }

    public Paciente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + this.id +
                ", cpf=" + this.cpf +
                ", nome='" + this.nome + '\'' +
                '}';
    }
}

