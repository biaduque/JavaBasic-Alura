/** 
 * Classe Conta: especificação de um tipo que define atributo e 
 * possíveis comportamentos para esse tipo
*/

class Conta {
    // Para aprender: atributos pertencem à uma classe
    double saldo;
    String agencia;
    String numero;
    Pessoa titular;

    void criaConta(String agencia, String numero, Pessoa titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
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
}