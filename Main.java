// Encontre o maior número do array.
public class Main {

    public static void main(String[] args) {

        int[] numeros = { 25, 60, 18, 90, 40 };

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > maior) {

                maior = numeros[i];

            }

        }

        System.out.println(maior);

    }

}
