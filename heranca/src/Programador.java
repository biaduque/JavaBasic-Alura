public class Programador extends Funcionario {

    public double getBonificacao() {
            System.out.println("Chamando o método de bonificacao do PROGRAMADOR");
            double boni = super.getBonificacao() + 100;;
            System.out.println("Bonificação PROGRAMADOR: " + boni);

            return boni;

    }

}