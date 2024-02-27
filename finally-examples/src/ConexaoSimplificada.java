// AutoCloseable exige a implementacao de seu protocolo 
// no caso, a implementacao do metodo Close()
public class ConexaoSimplificada implements AutoCloseable {
    public ConexaoSimplificada() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException(); // forçando um erro para exemplo
    }

    public void fecha() {
        System.out.println("Fechando conexao");
    }

    @Override
    public void close() {
        System.out.println("Fechando conexao");
    }
}
/*
 * A IllegalArgumentException (argumentos recebidos funcao) e IllegalStateException são duas exceções importantes
 */