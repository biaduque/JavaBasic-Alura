// Interface::: Uma classe abstrata nao pode ser instanciada. Ela apenas é utilizada como herança 
public abstract class Funcionario {

    private String nome;
    private String cpf;
    protected double salario; // protected permite que gerente extenda o atributo sem a necessidade de deixar o atributo publico

    // um metodo abstrato nao pode ser implementado. Ele é utilizado apenas como parte da Interface
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}