public class Operadores {
    public static void main(String[] args) {
        // ---- Operadores Aritméticos ----
        // Usados para realizar operações matemáticas básicas.

        int soma = 10 + 5;       // Adição (+)
        int subtracao = 10 - 5;  // Subtração (-)
        int multiplicacao = 10 * 5; // Multiplicação (*)
        int divisao = 10 / 2;    // Divisão inteira (/)
        int resto = 10 % 3;      // Módulo (resto da divisão) (%)

        // ---- Operadores de Atribuição ----
        // Usados para definir ou modificar valores de variáveis.

        int numero = 10;   // Atribuição (=)
        numero += 5;       // Equivale a numero = numero + 5
        numero -= 2;       // Equivale a numero = numero - 2
        numero *= 3;       // Equivale a numero = numero * 3
        numero /= 2;       // Equivale a numero = numero / 2
        numero %= 3;       // Equivale a numero = numero % 3

        // Exibir o valor final da variável para evitar warnings
        System.out.println("Número após operações de atribuição: " + numero);

        // ---- Operadores de Incremento e Decremento ----
        int contador = 0;
        contador++;  // Incrementa 1 (equivalente a contador = contador + 1)
        contador--;  // Decrementa 1 (equivalente a contador = contador - 1)

        // ---- Operadores Relacionais ----
        // Usados para comparar valores, retornando um booleano (true ou false).

        boolean igual = (10 == 10); // Igualdade (==)
        boolean diferente = (10 != 5); // Diferença (!=)
        boolean maior = (10 > 5);  // Maior que (>)
        boolean menor = (10 < 5);  // Menor que (<)
        boolean maiorOuIgual = (10 >= 10); // Maior ou igual (>=)
        boolean menorOuIgual = (5 <= 10);  // Menor ou igual (<=)

        // ---- Operadores Lógicos ----
        // Usados para operações lógicas, retornando true ou false.

        boolean cond1 = true;
        boolean cond2 = false;

        boolean and = (cond1 && cond2); // AND lógico (&&) - Retorna true se ambos forem true
        boolean or = (cond1 || cond2);  // OR lógico (||) - Retorna true se pelo menos um for true
        boolean not = !cond1;           // NOT lógico (!) - Inverte o valor booleano

        // ---- Operador Ternário ----
        // Forma reduzida de if-else para atribuições simples.

        int idade = 18;
        String podeDirigir = (idade >= 18) ? "Pode dirigir" : "Não pode dirigir";

        // ---- Operadores Bitwise (Bit a Bit) ----
        // Usados para manipulação direta de bits (menos comuns).

        int bitwiseAnd = 5 & 3; // AND bit a bit (&)
        int bitwiseOr = 5 | 3;  // OR bit a bit (|)
        int bitwiseXor = 5 ^ 3; // XOR bit a bit (^)
        int bitwiseNot = ~5;    // NOT bit a bit (~)
        int shiftLeft = 5 << 1; // Deslocamento à esquerda (<<) multiplica por 2
        int shiftRight = 5 >> 1; // Deslocamento à direita (>>) divide por 2

        // ---- Exibição dos resultados ----
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + resto);
        
        System.out.println("Contador após incremento e decremento: " + contador);
        
        System.out.println("10 == 10? " + igual);
        System.out.println("10 != 5? " + diferente);
        System.out.println("10 > 5? " + maior);
        System.out.println("10 < 5? " + menor);
        System.out.println("10 >= 10? " + maiorOuIgual);
        System.out.println("5 <= 10? " + menorOuIgual);

        System.out.println("AND lógico: " + and);
        System.out.println("OR lógico: " + or);
        System.out.println("NOT lógico: " + not);

        System.out.println("Pode dirigir? " + podeDirigir);

        System.out.println("Bitwise AND (5 & 3): " + bitwiseAnd);
        System.out.println("Bitwise OR (5 | 3): " + bitwiseOr);
        System.out.println("Bitwise XOR (5 ^ 3): " + bitwiseXor);
        System.out.println("Bitwise NOT (~5): " + bitwiseNot);
        System.out.println("Shift Left (5 << 1): " + shiftLeft);
        System.out.println("Shift Right (5 >> 1): " + shiftRight);
    }
}
