public class Pix implements Pagamento{

    @Override
    public void autorizar(double valor) {
        System.out.println("Gerando um QRcode para a chave pix");
        System.out.println("Pagamento no valor " + valor + " foi enviado instantaneamente");
    }

    @Override
    public void exibirComprovante() {
        System.out.println("Dísponivel no APP do banco.");
    }
}
