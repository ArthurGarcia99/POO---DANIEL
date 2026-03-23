package TimeBasquete;

public class TestaTime {
    public static void main(String[] args){

        Atleta atl1 = new Atleta(1, "Arthur", "Ala");
        Time tim1 = new Time(25, "KINGS", "Matheus");

        tim1.contratarAtleta(atl1);

        System.out.println("Atleta e time antes de excluir o time:");
        System.out.println(atl1);
        System.out.println(tim1);

        tim1 = null;

        System.out.println("Atleta e time apos a exclusão do time:");
        System.out.println(atl1);
        System.out.println(tim1);
    }
}
