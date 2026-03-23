package SistemaCineTeatro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id, sala;
    private LocalDateTime data;
    private ArrayList<Ingresso> ingressos;
    private Filme filme;

    public Sessao() {
        this.ingressos = new ArrayList<>();
    }

    public Sessao(int id, int sala, LocalDateTime data) {
        this.id = id;
        this.sala = sala;
        this.data = data;
        this.ingressos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getSala() {
        return sala;
    }

    public LocalDateTime getData() {
        return data;
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void vincularFilme(Filme f){
        this.filme = f;
        System.out.println("Filme vinculado com sucesso!");
    }

    public void venderIngresso(int id, String assento, String tipo, double preco){
        Ingresso ing1 = new Ingresso(id, assento, tipo, preco);
        this.ingressos.add(ing1);
        System.out.println("Ingresso vendido com sucesso!");
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        String resultado = "Sessão:\n";
        resultado += "ID: " + id + "\n";
        resultado += "Sala: " + sala + "\n";
        resultado += "Data: " + data.format(formatoBR) + "\n";
        resultado += "Filme: " + (filme != null ? filme : "Não vinculado") + "\n";

        resultado += "Ingressos:\n";

        if (ingressos.isEmpty()) {
            resultado += "Nenhum ingresso vendido\n";
        } else {
            for (Ingresso i : ingressos) {
                resultado += i + "\n";
            }
        }

        return resultado;
    }
}
