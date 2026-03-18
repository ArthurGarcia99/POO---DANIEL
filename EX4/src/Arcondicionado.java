public class Arcondicionado{

    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public Arcondicionado(){}

    public Arcondicionado(String marca, String modelo, int temperatura, boolean ligado){
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;
    }

    public void setMarca(String marca){
        if(marca.length() >= 3){
            this.marca = marca;
        }else{
            System.out.println("A marca possui menos de 3 caracteres.");
        }
    }

    public void setTemperatura(int temperatura){
        if(temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
        }else{
            System.out.println("Temperatura fora da faixa!");
        }
    }

    public boolean isLigado(){
        return ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void ativarModoTurbo(){
        if(this.ligado) {
            if (verificarCompressor()) {
                setTemperatura(16);
            }
        }
    }

    private boolean verificarCompressor(){
        System.out.println("Verificando Compressor");
        int randomico = (int) (Math.random() * 10);
        if(randomico > 2){
            System.out.println("Compressor Ok!");
            return true;
        }else{
            System.out.println("Problema no compressor!");
            return false;
        }
    }

    public String toString(){
        return "Esta Ligado? " + this.ligado +
                "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nTemperatura: " + this.temperatura;
    }
}