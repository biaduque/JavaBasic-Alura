public class TesteContas {

    public static void main(String[] args) throws SaldoInsuficienteException{

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(110.0, cp); // transferindo um valor maior que o saldo total, ira provocar ume erro...

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}