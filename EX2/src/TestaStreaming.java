public class TestaStreaming {

    public static void main(String[] args){

        Streaming s1 = new Streaming("Arthur", "Básico");

        s1.assistirFilme("Harry Potter");
        System.out.println(s1);
        s1.cancelarAssinatura();
        System.out.println(s1);
    }
}
