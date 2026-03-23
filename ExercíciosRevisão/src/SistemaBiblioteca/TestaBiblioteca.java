package SistemaBiblioteca;

import java.time.LocalDateTime;

public class TestaBiblioteca {
    public static void main(String[] args){

        Leitor lei1 = new Leitor(123, "Arthur");
        Livro liv1 = new Livro(23, "Harry Potter", "Joanne Rowling");

        LocalDateTime dataEmprestimo = LocalDateTime.of(2026, 3, 23, 13, 0);
        LocalDateTime dataDevolucao = LocalDateTime.of(2026, 4, 23, 13, 0);

        Emprestimo emp1 = new Emprestimo(dataEmprestimo, dataDevolucao, lei1, liv1);
        System.out.println(emp1);
    }
}
