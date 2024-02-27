/*
 * Hierarquia de exceções 
 * 
    // Throwable:: joga o objeto de erro na pilha (atraves da palavra reservada throw)
    // - -> Exception
    // - - -> RuntimeExcenption
    // - - - -> ArithmeticException 
 */

// A hierarquia iniciada com a classe Throwable é dividida em exceções e erros. 
// Exceções são usadas em códigos de aplicação. 
// Erros são usados exclusivamente pela máquina virtual.
public class Hierarquia {
    
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
            // uso da exceceo personalizada
            String msg = ex.getMessage(); // .getMessage é um metodo de throwable
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    // unchecked
    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch(ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
        System.out.println("Fim do metodo1");
    }

    // chechek:: assinatura do método sinalizando que o mesmo é perigoso 
    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        // uso da exceceo personalizada
        throw new MinhaExcecao("deu muito errado");
    }
}
