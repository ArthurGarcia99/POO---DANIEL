public class TestaConta {

    public static void main(String[] args){

        Conta c1 = new Conta(42134, 443, "João Silva");

        c1.depositar(500);
        System.out.println();
        c1.sacar(200);
        System.out.println();
        System.out.println(c1);
        System.out.println();

        Conta c2 = new Conta(53223, 523, "Maria Souza");

        c2.sacar(50);
        System.out.println();
        c2.depositar(100);
        System.out.println();
        c2.encerrarconta();
        System.out.println();

        c1.sacar(300);
        System.out.println();
        c1.encerrarconta();
        System.out.println();
        System.out.println(c1);
    }
}
