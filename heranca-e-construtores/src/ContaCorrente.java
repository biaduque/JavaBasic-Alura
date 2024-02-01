public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    // Anotacao @Override indica que o metodo da classe Pai (Conta) esta 
    // sendo sobrescrito 
    @Override
    public boolean saca(double valor) {
        System.out.println("Realizando saque especial na Conta - Corrente...");
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}

