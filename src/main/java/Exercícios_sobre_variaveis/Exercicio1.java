package Exercícios_sobre_variaveis;

//Refatoração de Código Mal Nomeado

public class Exercicio1 {

    private double preco;

    public Exercicio1(double preco) {
        this.preco = preco;
    }

    public double calcularTotal(double quantidade) {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        Exercicio1 produto = new Exercicio1(10.5);
        double total = produto.calcularTotal(3);
        System.out.println("Valor total: " + total);
    }
}
