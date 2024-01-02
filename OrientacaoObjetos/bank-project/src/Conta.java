/** 
 * Classe Conta::::: especificação de um tipo que define atributo e 
 * possíveis comportamentos para esse tipo 
 * Vantagem do uso de atributos privados::::: A implementação interna pode ser 
 * modificada sem afetar nenhum código fora da própria classe.
*/

class Conta {
    // Para aprender: atributos pertencem à uma classe
    private double saldo; // atributo privado que pode ser acessado apenas através de métodos
    private String agencia;
    private String numero;
    private Pessoa titular;

    // atua como setter
    void criaConta(String agencia, String numero, Pessoa titular) {
        // conferencia simples
        if (agencia == "" || numero == "") {
            App.print("Valor de agencia e números inválidos.");
            return;
        }
        this.agencia = agencia; //set agencia
        this.numero = numero; //set numero
        this.titular = titular; //set titular
    }
    // método: define um comportamento
    void deposita(double valor) {
        this.saldo += valor; 
    }

    public boolean saca(double valor) { 
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else { 
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor; 
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public Pessoa getTitular() {
        return this.titular;
    }
}