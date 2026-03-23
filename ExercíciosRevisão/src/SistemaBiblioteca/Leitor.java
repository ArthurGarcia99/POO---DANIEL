package SistemaBiblioteca;

public class Leitor {
    private int id;
    private String nome;

    public Leitor() {
    }

    public Leitor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Leitor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
