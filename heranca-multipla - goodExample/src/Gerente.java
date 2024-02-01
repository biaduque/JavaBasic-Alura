public class Gerente extends Funcionario implements Autenticavel {
    // Podemos estender apenas uma classe abstrata, mas podemos implementar várias interfaces.
    // Se existisse outra interface alem de Autenticavel, poderíamos implementar também 

    private int senha;

    public double getBonificacao() {
            System.out.println("Chamando o método de bonificacao do GERENTE");
            return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}