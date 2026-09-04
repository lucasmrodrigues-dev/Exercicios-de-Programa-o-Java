public class Main {

    public static void main(String[] args) {

        int[] numeros = { 10, 20, 30, 40, 50 };

        int procurado = 40;

        boolean encontrou = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == procurado) {

                encontrou = true;

            }

        }

        System.out.println(encontrou);

    }

}
