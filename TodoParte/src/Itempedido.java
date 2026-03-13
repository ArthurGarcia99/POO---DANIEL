public class Itempedido {
    private int id;
    private float qtde;
    private Produto produto;

    public Itempedido() {
    }

    public Itempedido(int id, float qtde, Produto produto) {
        this.id = id;
        this.qtde = qtde;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public float getQtde() {
        return qtde;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nItempedido: " +
                "ID = " + id +
                ", Quantidade = " + qtde +
                "\nProduto = " + produto;
    }
}
