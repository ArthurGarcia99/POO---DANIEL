package SistemaCineTeatro;

public class Ingresso {
    private int id;
    private String assento, tipo;
    private double preco;

    public Ingresso() {
    }

    public Ingresso(int id, String assento, String tipo, double preco) {
        this.id = id;
        this.assento = assento;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "id=" + id +
                ", assento='" + assento + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                '}';
    }
}
