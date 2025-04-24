public class Carro {
    private boolean ligado = false;
    private int velocidade = 0;
    private int marcha = 0;

    public void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado.");
        } else {
            ligado = true;
            System.out.println("Carro ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado.");
        } else if (velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Não é possível desligar o carro. Ele precisa estar parado e em ponto morto.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }

        if (marcha == 0) {
            System.out.println("O carro está em ponto morto. Troque a marcha antes de acelerar.");
            return;
        }

        if (velocidade >= 120) {
            System.out.println("Velocidade máxima atingida!");
            return;
        }

        int novaVelocidade = velocidade + 1;
        if (verificarMarchaVelocidade(novaVelocidade)) {
            velocidade = novaVelocidade;
            System.out.println("Velocidade atual: " + velocidade + "km/h");
        } else {
            System.out.println("A velocidade não é compatível com a marcha atual!");
        }
    }

    public void acelerarForte() {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }

        if (marcha == 0) {
            System.out.println("O carro está em ponto morto. Troque a marcha antes de acelerar.");
            return;
        }

        int novaVelocidade = velocidade + 10;

        if (novaVelocidade > 120) {
            novaVelocidade = 120;
        }

        if (velocidade == novaVelocidade) {
            System.out.println("Velocidade máxima atingida!");
            return;
        }

        if (!verificarMarchaVelocidade(novaVelocidade)) {
            System.out.println("A velocidade após a aceleração não é compatível com a marcha atual!");
            return;
        }

        velocidade = novaVelocidade;
        System.out.println("Acelerando forte... Velocidade atual: " + velocidade + "km/h");
    }

    public void frear() {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }

        if (velocidade == 0) {
            System.out.println("O carro já está parado.");
        } else {
            velocidade--;
            System.out.println("Velocidade atual: " + velocidade + "km/h");
        }
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }

        if (velocidade >= 1 && velocidade <= 40) {
            if (direcao.equalsIgnoreCase("esquerda") || direcao.equalsIgnoreCase("direita")) {
                System.out.println("Virando para a " + direcao + "...");
            } else {
                System.out.println("Direção inválida. Use 'esquerda' ou 'direita'.");
            }
        } else {
            System.out.println("Velocidade fora do intervalo permitido para virar (1km a 40km).");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + "km/h | Marcha: " + marcha);
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida.");
            return;
        }

        if (Math.abs(novaMarcha - marcha) != 1 && novaMarcha != marcha) {
            System.out.println("Você só pode trocar uma marcha por vez.");
            return;
        }

        if (!verificarMarchaVelocidade(velocidade, novaMarcha)) {
            System.out.println("Velocidade incompatível com a marcha escolhida!");
            return;
        }

        marcha = novaMarcha;
        System.out.println("Marcha atual: " + marcha);
    }

    private boolean verificarMarchaVelocidade(int velocidade) {
        return verificarMarchaVelocidade(velocidade, marcha);
    }

    private boolean verificarMarchaVelocidade(int velocidade, int marcha) {
        return switch (marcha) {
            case 0 -> velocidade == 0;
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 20 && velocidade <= 40;
            case 3 -> velocidade >= 40 && velocidade <= 60;
            case 4 -> velocidade >= 60 && velocidade <= 80;
            case 5 -> velocidade >= 80 && velocidade <= 100;
            case 6 -> velocidade >= 100 && velocidade <= 120;
            default -> false;
        };
    }
}
