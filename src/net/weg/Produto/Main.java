package net.weg.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz"); // cria um novo objeto Produto com o nome "Arroz"
        Produto p2 = new Produto("Feijão"); // cria outro objeto Produto com o nome "Feijão"
        Produto.mostrarTotal(); // chama o método estático mostrarTotal para imprimir o total de produtos criados
    }
}

