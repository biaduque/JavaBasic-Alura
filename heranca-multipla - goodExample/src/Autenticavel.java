// Contrato Autenticavel
// A interface Autenticavel, por sua vez, é a abstração entre SistemaInterno e todas as pessoas que desejam acessá-lo. Ainda que estas pessoas não tenham relação entre si.
// Ela é um contrato onde quem assina se responsabiliza por implementar esses métodos (cumprir o contrato)
public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}