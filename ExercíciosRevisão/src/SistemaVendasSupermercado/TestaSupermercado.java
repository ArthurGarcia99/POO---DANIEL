package SistemaVendasSupermercado;

public class TestaSupermercado {
    public static void main(String[] args){
        Produto p1 = new Produto(1, 20.0, "Arroz");
        Produto p2 = new Produto(2, 10.0, "Feijão");

        Cliente cl1 = new Cliente(1, "Arthur");

        Venda ven1 = new Venda(cl1);

        ven1.AdicionarItem(1,2,p1);
        ven1.AdicionarItem(2, 3, p2);
        System.out.println(ven1);
    }
}
