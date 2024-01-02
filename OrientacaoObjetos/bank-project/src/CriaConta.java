/* 
 * Classe criada para a compreensão do conceito de atributos estáticos
 * Atributos estáticos se referem à classe como um todo, e não de seus objetos
 * Logo, o atributo estático é compartilhado entre todas as instâncias da classe
 */
public class CriaConta {
    private static int  totalContas = 0;
    public Conta criaConta(String agencia, String numero, Pessoa titular) {
        Conta conta = new Conta();
        conta.criaConta(agencia, numero, titular);
        totalContas++;
        return conta;
    }

    public int getTotalContas() {
        // atributo estático (atributo da própria classe) que é compartilhado entre todas as instâncias
        return totalContas;
    }
}
