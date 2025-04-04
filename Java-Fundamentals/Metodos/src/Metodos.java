public class Metodos {
    
    // Método principal (main), onde o programa começa a execução
    public static void main(String[] args) {
        // Chamando um método sem retorno
        saudacao();

        // Chamando um método que retorna um valor
        int somaResultado = somar(10, 5);
        System.out.println("Resultado da soma: " + somaResultado);

        // Chamando um método que retorna um booleano
        boolean maiorDeIdade = verificarIdade(20);
        System.out.println("É maior de idade? " + maiorDeIdade);

        // Chamando um método sem parâmetros
        exibirMensagem();

        // Chamando um método que calcula a média de três números
        double media = calcularMedia(7.5, 8.0, 9.0);
        System.out.println("Média: " + media);
    }

    // ---- Exemplos de Métodos ----

    // Método sem retorno e sem parâmetros
    public static void saudacao() {
        System.out.println("Olá, seja bem-vindo!");
    }

    // Método com retorno e com parâmetros
    public static int somar(int a, int b) {
        return a + b; // Retorna a soma dos dois números
    }

    // Método que verifica se a pessoa é maior de idade
    public static boolean verificarIdade(int idade) {
        return idade >= 18; // Retorna true se idade for 18 ou mais
    }

    // Método sem retorno que apenas exibe uma mensagem
    public static void exibirMensagem() {
        System.out.println("Esse é um método sem parâmetros e sem retorno.");
    }

    // Método que calcula a média de três números
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}
