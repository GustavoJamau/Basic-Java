// Classe base abstrata
abstract class FiguraGeometrica {
    // Método abstrato para calcular a área
    public abstract double calcularArea();
}

// Classe Quadrado que herda de FiguraGeometrica
class Quadrado extends FiguraGeometrica {
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Implementação do método calcularArea
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

// Classe Retangulo que herda de FiguraGeometrica
class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    // Construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementação do método calcularArea
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

// Classe Circulo que herda de FiguraGeometrica
class Circulo extends FiguraGeometrica {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação do método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
