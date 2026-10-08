/*
Crie uma classe Pessoa com os seguintes atributos:

nome
idade
Os atributos devem ser privados.

Crie:

um construtor para inicializar os dois atributos;
métodos get e set;
um método apresentar() que mostre o nome e a idade.



*/

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Sting getnome() {

        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int getidade() {
        return idade;
    }

    public void setidade(int idade) {

        this.idade = idade;

    }

    public void apresentar() {

        System.out.println("Meu nome é " + nome);
        System.out.println("Minha idade é " + idade);
    }
}