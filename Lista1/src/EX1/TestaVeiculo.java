package EX1;

public class TestaVeiculo {
    public static void main(String[] args){

        Aviao av1 = new Aviao(900f, "Boeing", "747", 1200f);
        CarroEletrico ce1 = new CarroEletrico(500, "Tesla", "Model S", 120f);

        Veiculo ve1;

        ve1 = av1;
        ve1.mover();

        ve1 = ce1;
        ve1.mover();
    }
}
