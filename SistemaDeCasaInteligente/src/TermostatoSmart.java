import java.util.Random;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura{
    private boolean ligada = false;

    @Override
    public void ligar() {
        if(!ligada){
            ligada = true;
            System.out.println("Termostato ligado!");
        }
    }

    @Override
    public void desligar() {
        if(ligada){
            ligada = false;
            System.out.println("Termostato desligado!");
        }
    }

    @Override
    public double lerTemperatura() {
        if(!ligada){
            System.out.println("Termostato desligado. Não é possível ler a temperatura.");
            return 0;
        }

        Random rand = new Random();
        double temperatura = 18 + (30 - 18) * rand.nextDouble();

        System.out.println("Temperatura atual: " + String.format("%.2f", temperatura) + "°C");
        return temperatura;
    }
}
