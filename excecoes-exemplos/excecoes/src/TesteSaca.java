/*
 * Se o valor do saque for maior que o deposito, temos uma exceção. 
 * Exception: Saldo: 200.0, Valor: 210.2
    SaldoInsuficienteException: Saldo: 200.0, Valor: 210.2
        at Conta.saca(Conta.java:27)
        at ContaCorrente.saca(ContaCorrente.java:12)
        at TesteSaca.main(TesteSaca.java:9)
 */
public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch(SaldoInsuficienteException ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println(conta.getSaldo());
    }
}