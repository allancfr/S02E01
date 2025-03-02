import java.util.Scanner;

public class NomeCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta e recebe o sobrenome
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        // Pergunta e recebe o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Concatena nome completo
        String nomeCompleto = nome + " " + sobrenome;

        // Remove espaços e calcula o número de letras
        int quantidadeLetras = nomeCompleto.replace(" ", "").length();

        // Exibe o resultado
        System.out.println("Seu nome completo é: " + nomeCompleto);
        System.out.println("Seu nome tem " + quantidadeLetras + " letras.");

        scanner.close();
    }
}
