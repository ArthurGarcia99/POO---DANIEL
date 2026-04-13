public class TestaInterfaces {
    public static void main(String[] args){

        FechaduraEletronica fechadura = new FechaduraEletronica("1234");

        fechadura.validarAcesso("0000");
        fechadura.ligar();

        fechadura.validarAcesso("1234");
        fechadura.ligar();
        fechadura.desligar();

        System.out.println("----------------------");

        TermostatoSmart termostato = new TermostatoSmart();

        termostato.lerTemperatura();
        termostato.ligar();
        termostato.lerTemperatura();
        termostato.desligar();
    }
}
