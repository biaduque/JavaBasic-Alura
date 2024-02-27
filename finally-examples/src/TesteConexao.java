public class TesteConexao {
    public static void main(String[] args) {
        Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        } finally {
            // Bloco finally é executado com ou sem erro de execucao
            // O bloco finally é tipicamente utilizado para fechar um recurso como conexão ou transação.
            // O bloco finally é opcional quando há bloco catch.
            if(con != null) {
                con.fecha(); 
            }
        }
    }
}