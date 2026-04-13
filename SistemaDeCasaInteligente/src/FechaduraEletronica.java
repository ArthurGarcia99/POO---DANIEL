public class FechaduraEletronica implements Autenticavel, DispositivoLigavel{
    private String senhaCorreta;
    private boolean acessoLiberado = false;
    private boolean ligada = false;

    public FechaduraEletronica(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
    }

    @Override
    public void validarAcesso(String senha) {
        if(this.senhaCorreta.equalsIgnoreCase(senha)){
            acessoLiberado = true;
            System.out.println("Acesso liberado!");
        }else{
            acessoLiberado = false;
            System.out.println("Senha incorreta!");
        }
    }

    @Override
    public void ligar() {
        if(acessoLiberado){
            ligada = true;
            System.out.println("Fechadura destrancada.");
        }else{
            System.out.println("Acesso negado! Valide a senha primeiro.");
        }
    }

    @Override
    public void desligar() {
        if(ligada){
            ligada = false;
            System.out.println("Fechadura trancada.");
        }
    }
}
