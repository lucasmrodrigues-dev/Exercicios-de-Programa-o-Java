import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("MAIÚSCULAS: " + frase.toUpperCase());
        System.out.println("MINÚSCULAS: " + frase.toLowerCase());

        scanner.close();
    }
}
