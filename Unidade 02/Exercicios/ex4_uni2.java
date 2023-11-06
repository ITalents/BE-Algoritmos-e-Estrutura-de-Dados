import java.util.Stack;

public class ex4_uni2 {
    public static void main(String[] args) {
        String expressao1 = "(a + b) * (c - d)"; // Expressão balanceada
        String expressao2 = "((a + b) * (c - d)"; // Expressão desbalanceada
        String expressao3 = ")(a + b)("; // Expressão desbalanceada
        String expressao4 = "a + b - c * d"; // Expressão sem parênteses

        System.out.println("A expressão 1 está balanceada? " + verificarBalanceamento(expressao1));
        System.out.println("A expressão 2 está balanceada? " + verificarBalanceamento(expressao2));
        System.out.println("A expressão 3 está balanceada? " + verificarBalanceamento(expressao3));
        System.out.println("A expressão 4 está balanceada? " + verificarBalanceamento(expressao4));
    }

    public static boolean verificarBalanceamento(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(') {
                pilha.push(caractere);
            } else if (caractere == ')') {
                if (pilha.isEmpty() || pilha.peek() != '(') {
                    return false;
                } else {
                    pilha.pop();
                }
            }
        }

        return pilha.isEmpty(); // A expressão está balanceada se a pilha estiver vazia no final
    }
}
