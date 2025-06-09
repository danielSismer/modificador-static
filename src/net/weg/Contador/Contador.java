package net.weg.Contador;

public class Contador {
    static int valor = 10; // variável estática, compartilhada entre todas as instâncias da classe

    public static void main(String[] args) {
        Contador a = new Contador(); // cria uma instância de Contador

        Contador b = new Contador();// cria outra instância de Contador

        a.valor = 20; // altera o valor da variável estática através da instância 'a'

        System.out.println(b.valor); // imprime o valor da variável estática através da instância 'b'

    }

    // altera o valor de 'b' também pois 'valor' é estático e compartilhado entre todas as instâncias
}

