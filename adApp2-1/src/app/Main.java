package app;

import java.util.Scanner;
import model.Personagem;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Personagem p = new Personagem("Arthas", "Guerreiro", 1000.00);

        System.out.println(p);

        int opcao;

        do {
            System.out.println("\n1 - Mudar nome");
            System.out.println("2 - Mudar classe");
            System.out.println("3 - Mostrar vida atual");
            System.out.println("4 - Regenerar vida");
            System.out.println("5 - Receber dano");
            System.out.println("6 - Status do personagem");
            System.out.println("7 - Alterar vida diretamente");
            System.out.println("0 - Sair\n");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nNovo nome: ");
                    String nome = sc.nextLine();
                    p.setNome(nome);
                    break;

                case 2:
                    System.out.print("\nNova classe: ");
                    String classe = sc.nextLine();
                    p.setClasse(classe);
                    break;

                case 3:
                    System.out.println("\nVida atual: " + p.getVida());
                    break;

                case 4:
                    System.out.print("\nValor para curar: ");
                    double cura = sc.nextDouble();
                    p.curar(cura);
                    break;

                case 5:
                    System.out.print("\nValor de dano: ");
                    double dano = sc.nextDouble();
                    p.recDano(dano);
                    break;

                case 6:
                    System.out.println("\n");
                    System.out.println(p);
                    break;

                case 7:
                    System.out.print("\nNova vida: ");
                    double novaVida = sc.nextDouble();
                    p.setVida(novaVida);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}