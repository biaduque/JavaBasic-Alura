public class ContaPoupanca extends Conta {

    // Crio um construtor. A Herança nao se aplica para construtores
    // Apenas para metodos e atributos
    // Por isso, é importante explicitar o construtor
    public ContaPoupanca(int agencia, int numero) {
        // Explicitando o construtor da classe pai passando os objetos recebidos
        super(agencia, numero);
    }

}