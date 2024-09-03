import java.util.Scanner;

public class VerificaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva uma string: ");
        String string = scanner.nextLine();
        scanner.close();

        int qtdCaracteresPresentes = quantidadeCaracterePresente(string, "a");
        if(qtdCaracteresPresentes > 0) {
            System.out.println("A string possui a letra 'a' e há " + qtdCaracteresPresentes + " ocorrências.");
        } else {
            System.out.println("A string não possui o caractere 'a'.");
        }

    }

    public static int quantidadeCaracterePresente(String string, String caractere) {
        caractere = caractere.toUpperCase();
        int quantidade = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).toUpperCase().equals(caractere)) {
                quantidade++;
            }
        }
        return quantidade;

    }
}