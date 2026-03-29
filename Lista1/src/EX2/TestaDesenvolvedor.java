package EX2;

public class TestaDesenvolvedor {

    public static void exibir(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao + " Bonus " + camaleao.calcularBonus());
    }

    public static void main(String[] args){
        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");
        exibir(jr1);

        Pleno pl1 = new Pleno("Beltrano", "Java", 6000, 5);
        exibir(pl1);

        Senior sr1 = new Senior("Ciclano", "Java", 8000, 3000);
        exibir(sr1);

    }
}

