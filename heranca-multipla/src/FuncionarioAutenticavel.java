// Heranca nivel 1
// Como podemos perceber, FuncionarioAutenticavel  tem relação somente com a senha 
// e o método autentica(), e não necessariamente com os funcionários

public abstract class FuncionarioAutenticavel extends Funcionario {

    private int senha;

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
}