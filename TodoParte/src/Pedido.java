import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; // associação todo-parte
    private ArrayList<Itempedido> Itenspedido;

    public Pedido() {
        this.Itenspedido = new ArrayList<>(); // aloca espaço na memoria
    }
    //o cliente veio pronto, mostrando sua independencia do pedido
    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.Itenspedido = new ArrayList<>();
    }

    //adiciona um itempedido no vetor ou no pedido
    public void adicionaItemPedido(int id, float qtde,Produto produto){
        Itempedido aux = new Itempedido(id, qtde, produto);
        this.Itenspedido.add(aux);
        System.out.println("Item do pedido adicionado com sucesso.");
    }

    public int getId() {
        return this.id;
    }

    public Date getData() {
        return this.data;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float CalcularTotal(){
        float total = 0;
        for(int i = 0; i < Itenspedido.size(); i++){
            total+= Itenspedido.get(i).getProduto().getPreco() * Itenspedido.get(i).getQtde();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido:" +
                " ID = " + id +
                ", Data = " + data +
                "\nCliente: " + cliente +
                "\nItens Do Pedido: " + Itenspedido;
    }
}
