package EX1;

public class CarroEletrico extends Veiculo{
    private int autonomiaBateria;

    public CarroEletrico() {
        super();
    }

    public CarroEletrico(int autonomiaBateria, String marca, String modelo, float velocidade) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public String toString() {
        return "CarroEletrico{" +
                super.toString() +
                "autonomiaBateria=" + autonomiaBateria +
                '}';
    }

    @Override
    public void mover(){
        System.out.println("Carro elétrico movendo-se silenciosamente.");
    }

    @Override
    public void abastecer(){
        System.out.println("Recarregando bateria em posto de carga rápida.");
    }
}
