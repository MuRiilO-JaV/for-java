package Exercícios_sobre_variaveis;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + " - Preço: R$ " + preco);
    }
}
