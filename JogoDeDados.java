package jogoDado;

public class JogoDeDados {
    private Jogador jogador1;
    private Jogador jogador2;
    private Dado dado;

    public JogoDeDados(Jogador jogador1, Jogador jogador2, Dado dado) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.dado = dado;
    }
    public void iniciarJogo() {
        System.out.println("\n=== JOGO DE DADOS ===");
        System.out.println("Jogadores: " + jogador1.getNome() + " vs " + jogador2.getNome());
        System.out.println("Dado de " + dado.getNumeroDeLados() + " lados\n");

        int rodada = 1;
        while (true) {
            System.out.println("--- Rodada " + rodada + " ---");

            int resultado1 = jogador1.jogar(dado);
            int resultado2 = jogador2.jogar(dado);

            System.out.println(jogador1.getNome() + " tirou: " + resultado1);
            System.out.println(jogador2.getNome() + " tirou: " + resultado2);

            if (resultado1 > resultado2) {
                System.out.println("\n🎉 " + jogador1.getNome() + " VENCEU! 🎉");
                System.out.println("Resultado final: " + resultado1 + " x " + resultado2);
                break;
            } else if (resultado2 > resultado1) {
                System.out.println("\n🎉 " + jogador2.getNome() + " VENCEU! 🎉");
                System.out.println("Resultado final: " + resultado1 + " x " + resultado2);
                break;
            } else {
                System.out.println("EMPATE! Nova rodada necessária...\n");
                rodada++;
            }
        }
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public Dado getDado() {
        return dado;
    }
}
