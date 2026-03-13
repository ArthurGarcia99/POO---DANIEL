public class Carro{
    // variaveis ou propriedades ou atributos
    public String marca, modelo; // string é tipo de dado do tipo classe
    public float velocidade; // float é um tipo de dado primitivo
    public boolean motor; // boolean é um tipo de dado primitivo

    //metodo construtor default
    public Carro(){
        this("Sem Marca", "Sem Modelo", 0, false);
    }

    //metodo construtor quando se passa os parametros necessarios
    public Carro(String marca, String modelo, float velocidade, boolean motor){
        this.marca = marca; // this representa o objeto qual foi chamado o metodo construtor
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }

    // ligar carro
    // nao precisa passar o parametro pois este metodo ja esta dentro da classe que tem acesso aos parametros
    public void ligar(){
        if(this.motor){
            System.out.println("Motor já Ligado!");
        }else{
            this.motor = true;
            System.out.println("Motor ligado!");
        }

    }

    public void desligar(){
        if(this.motor && this.velocidade == 0) {
            this.motor = false;
            System.out.println("Motor Desligado!");
        }
    }

    public void acelerar(float aumento){
        if(this.motor) {
            this.velocidade += aumento;
            System.out.println("A velocidade do carro " + this.marca + " aumentou em " + aumento + "km/h");
        }
    }

    public void desacelerar(float diminuicao){
        if(this.motor && this.velocidade - diminuicao >= 0){
            this.velocidade -= diminuicao;
            System.out.println("O carro " + this.marca + " diminui " + diminuicao + " km/h");
        }else{
            System.out.println("Não foi possível frear!");
        }
    }

    // metodo que converte o objeto em string
    public String toString(){
        // this representa o objeto que chama o metodo
        return  "Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Velocidade: " + this.velocidade +
                " Motor: " + this.motor;
    }
}