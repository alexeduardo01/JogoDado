package jogoDado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BEM-VINDO AO JOGO DE DADOS ===");

        // Solicitar nomes dos jogadores
        System.out.print("Digite o nome do Jogador 1: ");
        String nome1 = scanner.nextLine().trim();

        System.out.print("Digite o nome do Jogador 2: ");
        String nome2 = scanner.nextLine().trim();

        // Validar nomes vazios
        if (nome1.isEmpty()) nome1 = "Jogador1";
        if (nome2.isEmpty()) nome2 = "Jogador2";

        // Ajustar nomes se forem iguais
        if (nome1.equals(nome2)) {
            nome1 += "1";
            nome2 += "2";
            System.out.println("\nNomes iguais detectados! Ajustando para: " + nome1 + " e " + nome2);
        }

        // Configurar dado
        int lados = 0;
        while (lados < 2) {
            System.out.print("\nDigite o número de lados do dado (mínimo 2): ");
            try {
                lados = scanner.nextInt();
                if (lados < 2) {
                    System.out.println("Erro: O dado deve ter no mínimo 2 lados!");
                }
            } catch (Exception e) {
                System.out.println("Erro: Digite um número válido!");
                scanner.nextLine(); // limpar buffer
            }
        }

        try {
            // Criar objetos do jogo
            Dado dado = new Dado(lados);
            Jogador jogador1 = new Jogador(nome1);
            Jogador jogador2 = new Jogador(nome2);

            // Criar e iniciar o jogo
            JogoDeDados jogo = new JogoDeDados(jogador1, jogador2, dado);
            jogo.iniciarJogo();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro na criação do jogo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\nObrigado por jogar!");
        scanner.close();
    }
}
