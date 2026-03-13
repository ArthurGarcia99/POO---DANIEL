public class Cliente{
    private int id;
    private String nome, cpf, endereco;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                ", Nome = " + nome +
                ", CPF = " + cpf +
                ", Endereço = " + endereco;

    }
}