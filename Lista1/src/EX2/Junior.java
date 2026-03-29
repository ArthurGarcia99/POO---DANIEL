package EX2;

public class Junior extends Desenvolvedor {
    private String mentor;

    public Junior(){
        super();
    }

    public Junior(String nome, String linguagem, float salarioBase, String mentor) {
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "Junior{" +
                super.toString() +
                "mentor='" + mentor + '\'' +
                '}';
    }

    @Override // Anulação de metodo
    public void codar(){
        System.out.println("Junior desenvolvendo código com mentoria de " + this.mentor);
    }
}

