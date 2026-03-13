public class Streaming{
    public String usuario, ultimoFilmeAssistido, plano;
    public double mensalidade;
    public boolean ativo;

    public Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";
        if(this.plano == "Básico"){
            this.mensalidade = 25.90;
        }else if(this.plano == "Premium"){
            this.mensalidade = 45.90;
        }else if(this.plano == "Família"){
            this.mensalidade = 60.90;
        }
    }

    public void assistirFilme(String nomeFilme){
        if(this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        }else{
            System.out.println("Precisa pagar a fatura!");
        }
    }

    public void cancelarAssinatura(){
        if(this.ativo){
            this.ativo = false;
            System.out.println("Sua assinatura foi cancelada!");
        }else{
            System.out.println("Sua assinatura já esta cancelada!");
        }
    }

    public String toString(){
        String status;

        if(this.ativo){
            status = "Ativo";
        }else{
            status = "Suspenso";
        }

        return "Usuario: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: " + mensalidade +
                "\nUltimo filme assistido: " + ultimoFilmeAssistido +
                "\nAssinatura: " + status;
    }
}

