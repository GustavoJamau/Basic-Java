public class Main {
    public static void main(String[] args) {
        // Criando objetos para cada tipo de figura
        FiguraGeometrica quadrado = new Quadrado(4);
        FiguraGeometrica retangulo = new Retangulo(5, 7);
        FiguraGeometrica circulo = new Circulo(3);

        // Imprimindo as áreas
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}