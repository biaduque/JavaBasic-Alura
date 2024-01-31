//Gerente é um Funcionário, Gerente herda da classe Funcionário
// A) Herda todas as características da classe Funcionario.
// B) Herda todo o comportamento da classe Funcionario.
// C) É um Funcionario.

public class Gerente extends Funcionario {

    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    // Sobrecarga:: novo método, recebendo dois parametros
     public boolean autentica(String login, int senha) {
        return false;
    }

    // Reescrita:: override | reescrever um metodo da classe pai
    public double getBonificacao() {
        // Usamos .super para especificar que é um atributo da classe pai
        return super.getBonificacao() + super.getSalario();
    }
}