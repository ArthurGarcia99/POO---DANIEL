public class TestaPlacar {
    public static void main(String[] args){

        Placar s1 = new Placar("Lakers", "Houston");

        s1.registrarPonto("casa", 1);
        s1.registrarPonto("visitante", 2);
        System.out.println(s1);
        s1.proximoQuarto();
        s1.proximoQuarto();
        s1.proximoQuarto();
        s1.proximoQuarto();
        System.out.println(s1);
    }
}
