package SistemaVendasSupermercado;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itensvenda;

    public Venda() {
        this.itensvenda = new ArrayList<>();
    }

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itensvenda = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<ItemVenda> getItensvenda() {
        return itensvenda;
    }

    public void AdicionarItem(int id, int quantidade, Produto produto){
        ItemVenda pro = new ItemVenda(id, quantidade, produto);
        this.itensvenda.add(pro);
        System.out.println("Item adicionado com sucesso!");
    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", itensvenda=" + itensvenda +
                '}';
    }
}
