package Exercícios_sobre_variaveis;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String clienteNome, nomeProduto, removerItem;
        double valorTotal = 0.0;

        Produto produto1 = new Produto("Produto A", 50.0);
        Produto produto2 = new Produto("Produto B", 30.0);
        Produto produto3 = new Produto("Produto C", 20.0);

        ArrayList<Produto> produtosSelecionados = new ArrayList<>();

        System.out.print("Digite seu nome: ");
        clienteNome = scanner.nextLine();

        System.out.println("Produtos disponíveis:");
        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
        produto3.exibirDetalhes();

        while (true) {
            System.out.println("Digite o nome do produto que deseja comprar (ou 'sair' para finalizar): ");
            nomeProduto = scanner.nextLine();

            if (nomeProduto.equalsIgnoreCase("sair")) {
                break;
            }

            if (nomeProduto.equalsIgnoreCase(produto1.getNome())) {
                produtosSelecionados.add(produto1);
                valorTotal += produto1.getPreco();
            } else if (nomeProduto.equalsIgnoreCase(produto2.getNome())) {
                produtosSelecionados.add(produto2);
                valorTotal += produto2.getPreco();
            } else if (nomeProduto.equalsIgnoreCase(produto3.getNome())) {
                produtosSelecionados.add(produto3);
                valorTotal += produto3.getPreco();
            } else {
                System.out.println("Produto não encontrado.");
            }
        }

        System.out.println("Produtos selecionados:");
        for (Produto produto : produtosSelecionados) {
            produto.exibirDetalhes();
        }

        System.out.println("Valor total: R$ " + valorTotal);

        System.out.println("Deseja remover algum item? (sim/não): ");
        removerItem = scanner.nextLine();

        if (removerItem.equalsIgnoreCase("sim")) {
            System.out.println("Digite o nome do produto que deseja remover: ");
            String produtoRemover = scanner.nextLine();

            boolean produtoRemovido = false;
            for (Produto produto : produtosSelecionados) {
                if (produto.getNome().equalsIgnoreCase(produtoRemover)) {
                    produtosSelecionados.remove(produto);
                    valorTotal -= produto.getPreco();
                    produtoRemovido = true;
                    System.out.println("Produto '" + produtoRemover + "' removido com sucesso!");
                    break;
                }
            }

            if (!produtoRemovido) {
                System.out.println("Produto não encontrado na lista de itens selecionados.");
            }
        }

        System.out.println("Valor final: R$ " + valorTotal);

        scanner.close();
    }
}