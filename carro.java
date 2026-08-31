package atividade;

public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;

    public void liga() {
        System.out.println("Carro ligado");
    }

    public void acelera(double quantidade) {
        this.velocidadeAtual += quantidade;
        if (this.velocidadeAtual > this.velocidadeMaxima) {
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }

    public int passarMarcha() {
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual <= 20) {
            return 1;
        } else if (this.velocidadeAtual > 20 && this.velocidadeAtual <= 40) {
            return 2;
        } else if (this.velocidadeAtual > 40 && this.velocidadeAtual <= 60) {
            return 3;
        } else if (this.velocidadeAtual >= 70 && this.velocidadeAtual <= 100) {
            return 4;
        } else if (this.velocidadeAtual > 100) {
            return 5;
        }
        return 0;
    }
}
