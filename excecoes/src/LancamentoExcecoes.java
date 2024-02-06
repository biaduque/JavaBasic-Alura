
public class LancamentoExcecoes {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
    }
    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch(ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
        System.out.println("Fim do metodo1");
    }

    // Lançamento de excecao::: throw
    private static void metodo2() {
        System.out.println("Ini do metodo2");
        // Essa é a forma mais comum que encontraremos no dia a dia. 
        throw new ArithmeticException("deu errado");
        //System.out.println("Fim do metodo2");
    }
}