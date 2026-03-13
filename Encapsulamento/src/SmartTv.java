public class SmartTv {

    private String marca, modelo;
    private int volume;
    private boolean conectadaInternet;

    public SmartTv(){}

    public SmartTv(String marca, String modelo, int volume) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectadaInternet = false;
    }

    // setter do volume
    public void setVolume(int volume){
        if(volume >= 0 && volume <= 100){
            this.volume = volume;
        }else{
            System.out.println("Volume Inválido!");
        }
    }

    // getter do volume
    public int getVolume(){
        return this.volume;
    }

    // setter da marca
    public void setMarca(String marca){
        if(marca.length() <= 30){
            this.marca = marca;
        }else{
            System.out.println("Marca Invalida!");
        }
    }

    // getter da marca
    public String getMarca(){
        return this.marca;
    }

    // setter do modelo
    public void setModelo(String modelo){
        if(Character.isUpperCase(modelo.charAt(0))){
            this.modelo = modelo;
        }else{
            System.out.println("A primeira letra do modelo não é Maiuscula!");
        }
    }

    // getter do modelo
    public String getModelo(){
        return this.modelo;
    }

    // getter do conectadaInternet
    public boolean isconectadaInternet(){
        return this.conectadaInternet;
    }

    // setter do conectadaInternet
    public void setconectadaInternet(boolean conectadaInternet){
        this.conectadaInternet = conectadaInternet;
    }

    //metodo abrir youtube
    public void abrirYoutube(){
        //verifica se tem internet
        if(conectaInternet()){
            System.out.println("Abrindo Youtube.");
        }else{
            System.out.println("Youtube não pode ser aberto, estamos sem internet!");
        }
    }

    //metodo encapsulado para verificar se tem internet
    private boolean conectaInternet(){
        System.out.println("Buscando sinal de Wi-Fi...");
        System.out.println("Verificando credenciais...");
        System.out.println("Autenticando IP do roteador");
        // 50% de chance de conectar e 50% de chance de nao conectador
        int randomico = (int) (Math.random() * 10);
        if(randomico < 5){
            System.out.println("Conectou na Internet");
            return true;
        }else{
            System.out.println("Problema na conexão");
            return false;
        }
    }

    //aumentar volume em x
    public void aumentarVolume(int x){
        this.setVolume(this.volume + x);
    }

    //diminuir volume em x
    public void diminuirVolume(int x){
        this.setVolume(this.volume - x);
    }

}