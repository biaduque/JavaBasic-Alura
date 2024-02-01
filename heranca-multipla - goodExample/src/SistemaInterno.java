public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Funcionario f) {
        boolean autenticou = f.autentica(this.senha);
        if(autenticou) {
            System.out.println("Pode entrar no sistema!");
        } else {
            System.out.println("Não pode entrar no sistema!");
        }
    }
}