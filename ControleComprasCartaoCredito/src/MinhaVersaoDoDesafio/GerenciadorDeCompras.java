package MinhaVersaoDoDesafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Compra {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}

public class GerenciadorDeCompras {
    private static double limiteCartao;
    private static double saldoDisponivel;
    private static ArrayList<Compra> compras = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite do cartão de crédito:");
        limiteCartao = scanner.nextDouble();
        saldoDisponivel = limiteCartao;

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Realizar compra");
            System.out.println("2. Exibir compras realizadas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1 -> realizarCompra(scanner);
                case 2 -> exibirCompras();
                case 3 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void realizarCompra(Scanner scanner) {
        System.out.print("Descrição da compra: ");
        String descricao = scanner.nextLine();
        System.out.print("Valor da compra: ");
        double valor = scanner.nextDouble();

        if (valor > saldoDisponivel) {
            System.out.println("Saldo insuficiente! MinhaVersaoDoDesafio.Compra não realizada.");
        } else {
            compras.add(new Compra(descricao, valor));
            saldoDisponivel -= valor;
            System.out.println("MinhaVersaoDoDesafio.Compra realizada com sucesso!");
        }
    }

    private static void exibirCompras() {
        if (compras.isEmpty()) {
            System.out.println("Nenhuma compra realizada.");
        } else {
            compras.sort(Comparator.comparingDouble(Compra::getValor).reversed());
            System.out.println("\nCompras realizadas (ordenadas por valor decrescente):");
            for (Compra compra : compras) {
                System.out.printf("Descrição: %s, Valor: %.2f%n", compra.getDescricao(), compra.getValor());
            }
        }
    }
}