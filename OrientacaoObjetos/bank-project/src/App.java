public class App {
    public static void main(String[] args) throws Exception {
        CriaConta construtor = new CriaConta();

        Pessoa beatriz = new Pessoa("Beatriz", 23, 70);;
        
        App.print("Usuário cadastrado: " + beatriz.nome);
        App.print("Criando conta");
        
        Conta conta = construtor.criaConta("0000", "000000-x", beatriz);

        App.print("Conta criada. Informações:\nAgencia: " + conta.getAgencia() + "\nNúmero: " + conta.getNumero() + "\nTitular: " + conta.getTitular().nome);
        App.print("Depositando R$50,00");

        conta.deposita(50);

        App.print("Transferindo R$ 5,00 de Beatriz para João");

        Conta contaJoao = construtor.criaConta("00001", "000001-x", new Pessoa("João", 22, 80));

        conta.transfere(5, contaJoao);

        App.print("Saldo Beatriz: R$"+ conta.getSaldo());

        App.print("O total de contas criadas foi: " + construtor.getTotalContas());

        
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
