public class TiposVariaveis {
    public static void main(String[] args) {
        // ---- Tipos Primitivos ----
        // Tipos primitivos são os tipos básicos de dados da linguagem Java.
        // Eles armazenam diretamente valores na memória e não possuem métodos ou comportamentos associados.
        // São mais eficientes em termos de desempenho, pois não criam objetos na memória.

        // Números inteiros:
        byte variavelByte = 127; // Ocupa 1 byte (-128 a 127)
        short variavelShort = 32767; // Ocupa 2 bytes (-32.768 a 32.767)
        int variavelInt = 2147483647; // Ocupa 4 bytes (-2^31 a 2^31 -1)
        long variavelLong = 9223372036854775807L; // Ocupa 8 bytes (-2^63 a 2^63 -1), precisa do 'L' no final

        // Números de ponto flutuante (para valores com casas decimais):
        float variavelFloat = 3.14f; // Ocupa 4 bytes, precisa do 'f' no final
        double variavelDouble = 3.14159265359; // Ocupa 8 bytes, mais preciso que float

        // Tipo caractere:
        char variavelChar = 'A'; // Armazena um único caractere Unicode (entre aspas simples '')

        // Tipo booleano:
        boolean variavelBoolean = true; // Pode ser true ou false

        // ---- Tipos Não Primitivos ----
        // Diferente dos tipos primitivos, os tipos não primitivos são objetos.
        // Eles possuem métodos, podem armazenar valores nulos (null) e são mais flexíveis.
        // Ocupam mais memória e exigem mais processamento do que os primitivos.

        // String (sequência de caracteres)
        String texto = "Olá, Java!"; // Diferente de char, usa aspas duplas "" e tem métodos úteis

        // Wrapper Classes (versões objeto dos tipos primitivos)
        Integer numeroWrapper = 42; // Pode armazenar null e tem métodos úteis
        Double decimalWrapper = 3.14;
        Boolean booleanWrapper = Boolean.TRUE;

        // ---- Variáveis e Modificadores ----

        // Variável constante (final)
        final double PI = 3.14159; // O valor de uma variável 'final' não pode ser alterado

        // Variáveis locais (declaração dentro de um método)
        int variavelLocal = 10; // Só existe dentro deste método

        // Exibição das variáveis no console
        System.out.println("Byte: " + variavelByte);
        System.out.println("Short: " + variavelShort);
        System.out.println("Int: " + variavelInt);
        System.out.println("Long: " + variavelLong);
        System.out.println("Float: " + variavelFloat);
        System.out.println("Double: " + variavelDouble);
        System.out.println("Char: " + variavelChar);
        System.out.println("Boolean: " + variavelBoolean);
        System.out.println("String: " + texto);
        System.out.println("Wrapper Integer: " + numeroWrapper);
        System.out.println("Wrapper Double: " + decimalWrapper);
        System.out.println("Wrapper Boolean: " + booleanWrapper);
        System.out.println("Constante PI: " + PI);
        System.out.println("Variável Local: " + variavelLocal);
    }
}
