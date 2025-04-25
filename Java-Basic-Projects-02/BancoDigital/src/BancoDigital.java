import java.util.ArrayList;
import java.util.List;

public class BancoDigital {

    private String nome;
    private final List<IConta> contas;  // Lista para armazenar as contas

    // Construtor para inicializar o nome do banco e a lista de contas
    public BancoDigital(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();  // Inicializando a lista de contas
    }

    // Getter e Setter para o nome do banco
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para adicionar uma conta ao banco
    public void adicionarConta(IConta conta) {
        contas.add(conta);
    }

    // Método para listar todas as contas e imprimir seus extratos
    public void listarContas() {
        System.out.println("=== Contas no " + nome + " ===");
        for (IConta conta : contas) {
            conta.imprimirExtrato();  // Polimorfismo: chama o método específico de cada tipo de conta
            System.out.println();
        }
    }
}
