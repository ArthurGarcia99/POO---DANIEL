import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> Questoes;

    // composição
    public void adicionarQuestao(int num, String texto, float peso){
        Questao aux = new Questao(num, texto, peso);
        this.Questoes.add(aux);
        System.out.println("Questão adicionada com sucesso.");
    }

    public Avaliacao() {
        this.Questoes = new ArrayList<>();
    }

    public Avaliacao(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.Questoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "\nID = " + id +
                ", NOME = " + nome +
                "\nQUESTÕES = " + Questoes;
    }
}
