public class TestaSmartTv {

    public static void main(String[] args){

        // cria uma instancia de SmartTv
        SmartTv s1 = new SmartTv();

        s1.setVolume(-11);
        s1.setVolume(150);
        s1.setVolume(50);

        s1.abrirYoutube();

        System.out.println("Volume de s1: " + s1.getVolume());
        System.out.println();

        SmartTv s2 = new SmartTv("Samsung", "Qled de 45 Polegadas", 0);
        s2.abrirYoutube();
        System.out.println();
        s2.aumentarVolume(50);
        s2.diminuirVolume(30);

        System.out.println("Volume de s2: " + s2.getVolume());
    }
}