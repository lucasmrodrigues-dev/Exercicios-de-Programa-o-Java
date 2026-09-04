class Veiculo {

    String marca;
    int ano;

    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {

}

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.marca = "Toyota";
        carro.ano = 2025;

        carro.mostrarDados();
    }
}
