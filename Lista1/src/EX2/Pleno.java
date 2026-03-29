package EX2;

public class Pleno extends Desenvolvedor{
    private int projEntr;

    public Pleno(){
        super();
    }

    public Pleno(String nome, String linguagem, float salarioBase, int projEntr) {
        super(nome, linguagem, salarioBase);
        this.projEntr = projEntr;
    }

    public int getProjEntr() {
        return projEntr;
    }

    public void setProjEntr(int projEntr) {
        this.projEntr = projEntr;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projEntr=" + projEntr +
                '}';
    }

    @Override
    public void codar(){
        System.out.println("Pleno desenvolvendo código e fazendo Code Rewiew");
    }

    @Override
    public float calcularBonus(){
        return super.calcularBonus() + this.salarioBase * 0.15f;
    }
}

