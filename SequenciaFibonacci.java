import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva um número: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonnaci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonnaci.");
        }
        scanner.close();
    }

    public static boolean isFibonacci(int numero) {
        if (numero < 0) {
            return false; 
        }
        return isQuadradoPerfeito(5 * numero * numero + 4) || isQuadradoPerfeito(5 * numero * numero - 4);
    }

    public static boolean isQuadradoPerfeito(int x) {
        if (x < 0) {
            return false;
        }
        int quadrado = (int) Math.sqrt(x);
        return quadrado * quadrado == x;
    }
}