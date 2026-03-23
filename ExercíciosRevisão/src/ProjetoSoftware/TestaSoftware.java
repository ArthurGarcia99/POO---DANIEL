package ProjetoSoftware;

public class TestaSoftware {
    public  static void main(String[] args){
        Programador pro1 = new Programador(123, "Arthur", "Java");
        Projeto proj1 = new Projeto(1, "Software Loja");

        proj1.ContrataProgramador(pro1);

        proj1.listarProgramadores();

    }
}
