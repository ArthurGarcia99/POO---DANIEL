package ProjetoSoftware;

public class Programador {
    private int id;
    private String nome, linguagemPrincipal;

    public Programador() {
    }

    public Programador(int id, String nome, String linguagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", linguagemPrincipal='" + linguagemPrincipal + '\'' +
                '}';
    }
}
