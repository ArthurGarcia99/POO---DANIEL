public class TestaCarro {

    public static void main(String[] args){

        // instanciar objeto obj1
        Carro obj1 = new Carro("Fiat","Uno",0, true);
        System.out.println(obj1 + "\n");

        obj1.ligar();
        System.out.println(obj1 + "\n");

        // instanciar objeto obj2
        Carro obj2 = new Carro("GM","Onix",0,false);
        System.out.println(obj2 + "\n");

        obj2.ligar();
        System.out.println(obj2 + "\n");

        obj1.desligar();
        obj2.desligar();
        System.out.println(obj1 + "\n");
        System.out.println(obj2 + "\n");

        // instanciar objeto obj3
        Carro obj3 = new Carro();
        System.out.println(obj3 + "\n");

        obj3.ligar();
        obj3.acelerar(90);
        System.out.println(obj3 + "\n");

        obj3.desacelerar(60);
        System.out.println(obj3 + "\n");

    }
}
