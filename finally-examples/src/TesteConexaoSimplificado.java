public class TesteConexaoSimplificado {
    public static void main(String[] args) {

        try (ConexaoSimplificada conexao = new ConexaoSimplificada()) {
            conexao.leDados(); // conexao fecha automaticamente e a excessao acontece no metodo leDados()
        } catch(IllegalStateException ex) {
            // dessa forma, o catch recebe a excecao que for passada pelo leDados() em caso de erro
            System.out.println("Deu erro na conexao");
        }
    }
}
