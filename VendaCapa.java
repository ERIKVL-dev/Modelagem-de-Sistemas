class Capa {
    private String cor;
    private String material;
    private double preco;

    public Capa(String cor, String material, double preco) {
        this.cor = cor;
        this.material = material;
        this.preco = preco;
    }

    public String getCor() { return cor; }
    public String getMaterial() { return material; }
    public double getPreco() { return preco; }
}

class Celular {
    private String marca, cor, modelo;
    private double valor;
    private Capa capa;

    public Celular(String marca, String cor, String modelo, double valor, Capa capa) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.valor = valor;
        this.capa = capa;
    }

    public double calcularValorTotal() {
        return this.valor + this.capa.getPreco();
    }

    public void exibirResumoVenda() {
        System.out.println("O valor total do celular " + this.marca + " com a capa " + this.capa.getCor() + " de " + this.capa.getMaterial() + " ficou de: R$" + String.format("%.1f", calcularValorTotal()));
    }
}

public class Main {
    public static void main(String[] args) {
        Capa c = new Capa("Verde", "Plástico", 50.0);
        Celular cel = new Celular("Motorola", "Preto", "G8", 1200.0, c);
        cel.exibirResumoVenda();
    }
}
