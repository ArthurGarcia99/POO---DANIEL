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
        if(time == "casa"){
            if(tipo == 1){
                this.pontosCasa+= 1;
            }else if(tipo == 2){
                this.pontosCasa+= 2;
            }else if(tipo == 3){
                this.pontosCasa+= 3;
            }
        }else if(time == "visitante"){
            if(tipo == 1){
                this.pontosVisitante+= 1;
            }else if(tipo == 2){
                this.pontosVisitante+= 2;
            }else if(tipo == 3){
                this.pontosVisitante+= 3;
            }
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