package Computador;

public class TestaComputador {
    public static void main(String[] args) {

        Computador com1 = new Computador(1, "Acer", "Intel", "i7", 3.5);

        System.out.println("Computador e processador antes da exclusão");
        System.out.println(com1);

        com1 = null;

        System.out.println("Computador e processador depois da exclusão do computador");
        System.out.println(com1);

    }
}
