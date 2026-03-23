package SistemaCineTeatro;

import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args){

        Filme f1 = new Filme(1, 150, "Ação", "Batman");
        Filme f2 = new Filme(2, 180, "Ficção", "Duna");

        LocalDateTime data = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao s1 = new Sessao(1, 1, data);

        s1.vincularFilme(f1);

        s1.venderIngresso(1, "A1", "MEIA", 15.00);
        s1.venderIngresso(1, "A2", "INTEIRA", 25.00);
        s1.venderIngresso(1, "A3", "MEIA", 15.00);

        System.out.println(s1);
    }
}
