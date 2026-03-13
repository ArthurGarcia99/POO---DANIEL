public class SistemaDrone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public SistemaDrone(){}

    public SistemaDrone(String codigo, float altura, int bateria, boolean emVoo){
        setCodigo(codigo);
        setAltura(altura);
        setBateria(bateria);
        setEmVoo(emVoo);
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setEmVoo(boolean emVoo){
        this.emVoo = emVoo;
    }

    public void setAltura(float altura){
        if(altura >= 0 && altura <= 120 && this.emVoo){
            this.altura = altura;
        }else{
            System.out.println("Altura Invalida!");
        }
    }

    public void setBateria(int bateria){
        if(bateria >= 0 && bateria <= 100){
            this.bateria = bateria;
        }else{
            System.out.println("Valor errado para Bateria.");
        }
    }

    public void decolar(){
        if(this.bateria > 20){
            if(testarMotores()){
                this.emVoo = true;
                this.altura = 2;
            }
        }
    }

    private boolean testarMotores(){
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");
        int randomico = (int) (Math.random() * 10);
        if(randomico < 8){
            System.out.println("Motores estão prontos");
            return true;
        }else{
            System.out.println("Erro nos motores");
            return false;
        }
    }

    public void subirDrone(float x){
        setAltura(this.altura + x);
    }

    public void descerDrone(float x){
        setAltura(this.altura - x);
    }

    public String toString(){
        return "Codigo: " + this.codigo +
                "\nAltura: " + this.altura +
                "\nBateria: " + this.bateria +
                "\nEsta em voo? " + this.emVoo;
    }
}
