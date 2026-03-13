public class Conta{

    public int numeroConta, agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta,int agencia,String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor){
        if(this.status){
            this.saldo += valor;
            System.out.println("Foi depositado " + valor + " reais");
        }else{
            System.out.println("Sua conta não esta ativa");
        }
    }

    public void sacar(float valor){
        if(this.status && this.saldo - valor >= 0){
            this.saldo -= valor;
            System.out.println("Foi sacado " + valor + " reais");
        }else{
            System.out.println("Conta Inativa ou saldo insuficiente!");
        }
    }

    public void encerrarconta(){
        if(this.status && this.saldo == 0){
            this.status = false;
            System.out.println("Sua conta foi desativada!");
        }else{
            System.out.println("Precisa sacar todo o dinheiro para desativar a conta!");
        }
    }

    public String toString() {
        return  "Numero da conta = " + numeroConta + "\n" +
                "Agencia = " + agencia + "\n" +
                "Nome cliente = " + nomeCliente + "\n" +
                "Saldo = " + saldo + "\n" +
                "Status = " + status;
    }
}
