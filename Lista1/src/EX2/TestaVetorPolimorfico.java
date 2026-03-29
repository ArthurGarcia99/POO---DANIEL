package EX2;

import javax.crypto.spec.DESedeKeySpec;

public class TestaVetorPolimorfico {
    public static void main(String[] args){
        Desenvolvedor[] vetor = new Desenvolvedor[4];

        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");
        vetor[0] = jr1;

        Pleno pl1 = new Pleno("Beltrano", "Java", 6000, 5);
        vetor[1] = pl1;

        Senior sr1 = new Senior("Ciclano", "Java", 8000, 3000);
        vetor[2] = sr1;

        Desenvolvedor de1 = new Desenvolvedor("Arthur", "Java", 3000);
        vetor[3] = de1;

        for(int i = 0; i < 4; i++){
            vetor[i].codar();
            System.out.println(vetor[i].calcularBonus());
            System.out.println(vetor[i]);
        }


    }
}
