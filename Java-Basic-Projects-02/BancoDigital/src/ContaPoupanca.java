public class ContaPoupanca extends Conta {

    public ContaPoupanca(Titular titular) {
        super(titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número da Conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
