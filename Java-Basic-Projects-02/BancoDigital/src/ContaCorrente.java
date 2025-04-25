public class ContaCorrente extends Conta {

    public ContaCorrente(Titular titular) {
        super(titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número da Conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
