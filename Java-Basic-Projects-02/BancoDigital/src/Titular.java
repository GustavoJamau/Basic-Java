public class Titular {
    private final String nome;  // Atributo final, imutável
    private final String cpf;   // Atributo final, imutável

    // Construtor
    public Titular(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos getter para acessar os valores dos atributos
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Sobrescrevendo o método toString para retornar uma representação legível
    @Override
    public String toString() {
        return nome + " (" + cpf + ")";
    }
}
