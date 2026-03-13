public class testaSistemaDrone {
    public static void main(String[] args){

        SistemaDrone s1 = new SistemaDrone("4325", 10, 50, false);

        s1.descerDrone(10);
        s1.subirDrone(30);
        System.out.println(s1);
        s1.decolar();

        System.out.println(s1);
    }
}
