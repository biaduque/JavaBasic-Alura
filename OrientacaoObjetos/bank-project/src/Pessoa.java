public class Pessoa {
    String nome;
    int idade;
    int peso;

    public Pessoa cadastrar(String nome, int idade, int peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        return this;
    }
}