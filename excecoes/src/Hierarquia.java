public class Hierarquia {
    
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
            // uso da exceceo personalizada
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
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

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        // uso da exceceo personalizada
        throw new MinhaExcecao("deu muito errado");
    }
}
