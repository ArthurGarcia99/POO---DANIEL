public class TestaArcondicionado {
    public static void main(String[] args){
        Arcondicionado s1 = new Arcondicionado("Samsung", "Grande", 22, true);

        s1.setMarca("AR");
        s1.setMarca("Philips");
        System.out.println(s1);

        s1.setTemperatura(12);
        s1.setTemperatura(20);
        System.out.println(s1);

        s1.ativarModoTurbo();
        System.out.println(s1);
    }
}