package jogoDado;

public class Jogador {
    private String nome;
    private int ultimaJogada;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public int jogar(Dado dado) {
        this.ultimaJogada = dado.rolar();
        return ultimaJogada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getUltimaJogada() {
        return ultimaJogada;
    }
}
