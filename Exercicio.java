import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os 3 números inteiros da entrada padrão
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Fecha o scanner após a leitura
        scanner.close();

        // Imprime cada número em uma nova linha
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}