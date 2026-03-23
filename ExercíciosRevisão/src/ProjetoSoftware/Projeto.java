package ProjetoSoftware;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nome;
    private ArrayList<Programador> programadores;

    public Projeto() {
        this.programadores = new ArrayList<>();
    }

    public Projeto(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.programadores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }

    public void listarProgramadores(){
        System.out.println("Programadores do projeto: " + this.nome);

        for(Programador p : programadores){
            System.out.println(p.getNome());
        }
    }

    public void ContrataProgramador(Programador a){
        this.programadores.add(a);
        System.out.println("Programador contratado com sucesso!");
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", programadores=" + programadores +
                '}';
    }
}
