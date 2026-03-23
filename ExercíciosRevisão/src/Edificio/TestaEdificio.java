package Edificio;

public class TestaEdificio {
    public static void main(String[] args){

        Edificio ed1 = new Edificio("Residencial Olivito", "Rua Alameda, 232");

        ed1.construirApartamento(101, 1);
        ed1.construirApartamento(102, 1);
        ed1.construirApartamento(201, 2);
        ed1.construirApartamento(202, 2);

        System.out.println(ed1);
    }
}
