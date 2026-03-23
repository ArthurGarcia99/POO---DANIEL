package SistemaClínicaMédica;

import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args){

        Medico med1 = new Medico(123, "Alberto", "Cirurgião");
        Paciente pac1 = new Paciente(1, "Pedro","43253253222");

        LocalDateTime data = LocalDateTime.of(2026, 5, 20, 14, 0);
        Consulta con1 = new Consulta(data, 500, med1, pac1);
        System.out.println(con1);
    }
}
