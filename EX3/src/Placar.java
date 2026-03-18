public class Placar{
    public String nomeTimeCasa, nomeTimeVisitante;
    public int pontosCasa, pontosVisitante, periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo){
        if (periodoQuarto > 4){
            System.out.println("Jogo já Terminou!");
            return;
        }

        if(tipo != 1 && tipo != 2 && tipo != 3){
            System.out.println("Tipo de ponto invalido!");
            return;
        }

        if(time.equalsIgnoreCase("casa")){
            this.pontosCasa += tipo;
        }else if(time.equalsIgnoreCase("visitante")){
            this.pontosVisitante += tipo;
        }

    }

    public void proximoQuarto(){
        if(this.periodoQuarto == 4){
            System.out.println("Jogo Terminou!");
        }else{
            this.periodoQuarto+= 1;
        }
    }

    public String toString(){
        return "Time A " + this.pontosCasa + " x " + this.pontosVisitante + " Time B - Período: " + this.periodoQuarto;
    }
}