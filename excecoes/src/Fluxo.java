// TO-DO Execute o código abaixo utilizando breakpoints e a opção de debug da sua IDE 

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
            // pipe clausula para multiplos catchs
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

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //int a = i / 0; // Erro aritmético que é forçado para exemplificar a exceção
        }
    }
}