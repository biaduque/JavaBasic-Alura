public class Conexao {

    public Conexao() {
        System.out.println("Abrindo conexao");
        throw new IllegalStateException(); // forçando um erro para exemplo
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException(); // forçando um erro para exemplo
    }

    public void fecha() {
        System.out.println("Fechando conexao");
    }
}