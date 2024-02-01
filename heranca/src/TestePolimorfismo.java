public class TestePolimorfismo {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Beatriz");
        gerente1.setSalario(5000.0);

        Programador programador1 = new Programador();
        programador1.setNome("Vinicius");
        programador1.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente1);
        controle.registra(programador1);

        System.out.println("Soma de bonificacoes:" + controle.getSoma());
    }
}