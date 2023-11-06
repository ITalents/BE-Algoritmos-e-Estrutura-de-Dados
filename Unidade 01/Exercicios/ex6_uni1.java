public class ex6_uni1 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 e 100:");

        for (int i = 2; i <= 100; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Método para verificar se um número é primo
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
