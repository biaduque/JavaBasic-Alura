public class App {
    public static void main(String[] args) throws Exception {
        Pessoa beatriz = new Pessoa().cadastrar("Beatriz", 23, 70);;
        
        App.print("Usuário cadastrado: " + beatriz.nome);
        App.print("Criando conta");
        
        Conta conta = new Conta();
        conta.criaConta("0000", "000000-x", beatriz);

        App.print("Conta criada. Informações:\nAgencia: " + conta.agencia + "\nNúmero: " + conta.numero + "\nTitular: " + conta.titular.nome);
        App.print("Depositando R$50,00");

        conta.deposita(50);

        App.print("Transferindo R$ 5,00 de Beatriz para João");

        Conta contaJoao = new Conta();
        contaJoao.criaConta("00001", "000001-x", new Pessoa().cadastrar("João", 22, 80));

        conta.transfere(5, contaJoao);

        App.print("Saldo Beatriz: R$"+ conta.saldo);

        
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
