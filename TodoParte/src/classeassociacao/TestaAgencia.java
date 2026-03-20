package classeassociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro ps1 = new Passageiro("123", "Fulano");
        System.out.println(ps1);

        LocalDateTime data = LocalDateTime.of(2026, 4, 18, 8, 15);
        Voo vo1 = new Voo(777, "Ribeirão Preto", "Brasilia", data);
        System.out.println(vo1);

        Reserva re1 = new Reserva(123, data, 23, ps1, vo1);
        System.out.println(re1);

        // usando o objeto re1 exiba o destino do voo da reserva
        System.out.println(re1.getVoo().getDestino());
        // usando o objeto re1 exiba o nome do passageira da reserva
        System.out.println(re1.getPassageiro().getNome());
    }
}
