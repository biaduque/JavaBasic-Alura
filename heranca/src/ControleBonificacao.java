public class ControleBonificacao {

    private double soma;

    // Polimorfismo:: ao utilizar o conceito de polimorfismo, conseguimos 
    // referenciar qualquer tipo de classe que for Funcionario (herdar de Funcionario)
    public void registra(Funcionario f) {
        // Sempre sera chamado o metodo especifico do tipo que for passado
        // Se o metodo nao existir em alguem que herdou, sera chamado a de Funcionario
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}