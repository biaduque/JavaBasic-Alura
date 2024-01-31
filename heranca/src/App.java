public class App {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Beatriz Duque");
        g1.setCpf("235568413");
        g1.setSalario(2000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2310);
        boolean autenticou = g1.autentica(2310);

        System.out.println(autenticou);
    }
}
