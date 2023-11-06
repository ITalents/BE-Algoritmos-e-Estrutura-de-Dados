import java.util.Scanner;

public class ex7_uni1 {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        inicializarTabuleiro(tabuleiro);
        boolean jogoAtivo = true;
        char jogadorAtual = 'X';

        while (jogoAtivo) {
            exibirTabuleiro(tabuleiro);
            realizarJogada(tabuleiro, jogadorAtual);
            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (verificarEmpate(tabuleiro)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("O jogo terminou em empate!");
                jogoAtivo = false;
            } else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
    }

    // Inicializa o tabuleiro com espaços vazios
    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // Exibe o tabuleiro atual
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Realiza a jogada do jogador atual
    public static void realizarJogada(char[][] tabuleiro, char jogador) {
        Scanner scanner = new Scanner(System.in);
        boolean jogadaValida = false;

        while (!jogadaValida) {
            System.out.print("Jogador " + jogador + ", digite a linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Jogador " + jogador + ", digite a coluna (0-2): ");
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogador;
                jogadaValida = true;
            } else {
                System.out.println("Jogada inválida! Tente novamente.");
            }
        }
    }

    // Verifica se há um vencedor
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
            (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }
        return false;
    }

    // Verifica se o jogo terminou em empate
    public static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
