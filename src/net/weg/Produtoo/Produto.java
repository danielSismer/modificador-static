package net.weg.Produtoo;

public class Produto {
    String nome;
    double preco;

    public static void mostrarPreco() {
        System.out.println(preco);
    }
}

// erro pois esta tentando acessar a variável de instância preco dentro de um método estático mostrarPreco, o que não é permitido.

// Para corrigir isso, você pode tornar o método mostrarPreco não estático ou tornar a variável preco estática.
