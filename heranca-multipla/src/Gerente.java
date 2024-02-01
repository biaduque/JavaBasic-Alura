// Herança nivel 2 ::: Herança múltipla
// Em java, não é uma boa prática.
public class Gerente extends FuncionarioAutenticavel {

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
        System.out.println("Chamando o método bonificacao do GERENTE");
        double boni = super.getSalario();
        System.out.println("Bonificacao GERENTE:" + boni);

        return boni;
    }
}