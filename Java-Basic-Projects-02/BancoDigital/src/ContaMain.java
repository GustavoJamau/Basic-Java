public class ContaMain {

    public static void main(String[] args) {
        // Criando um titular
        Titular titular1 = new Titular("João da Silva", "123.456.789-00");

        // Criando as contas e associando o titular
        IConta cc = new ContaCorrente(titular1);
        IConta cp = new ContaPoupanca(titular1);

        // Criando o banco digital
        BancoDigital banco = new BancoDigital("Banco Digital");

        // Adicionando as contas ao banco
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        // Realizando algumas operações na Conta Corrente
        cc.depositar(1000);
        cc.sacar(200);

        // Realizando algumas operações na Conta Poupança
        cp.depositar(500);
        cp.sacar(50);

        // Listando as contas (agora chama o método imprimirExtrato de forma polimórfica)
        banco.listarContas();
    }
}
