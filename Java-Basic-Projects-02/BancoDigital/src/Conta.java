public abstract class Conta implements IConta {
    // Constantes e variáveis estáticas
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    // Atributos da classe Conta
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Titular titular;

    // Construtor da classe Conta, onde o saldo é inicializado como 100 para qualquer tipo de conta
    public Conta(Titular titular) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 100;  // Inicializando o saldo com 100 para todas as contas
        this.titular = titular;
    }

    // Getter para o titular (retorna o nome e CPF do titular)
    public String getTitular() {
        return titular.toString();
    }

    // Métodos implementados da interface IConta
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Getters para acessar os valores de agência, número da conta e saldo
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método abstrato para imprimir o extrato (deve ser implementado nas classes filhas)
    @Override
    public abstract void imprimirExtrato();
}
