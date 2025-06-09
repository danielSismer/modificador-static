package net.weg.Produto;

public class Produto {
    String nome; // variavel de instância
    static int totalProdutos = 0; // variável estática, compartilhada entre todas as instâncias da classe

    public Produto(String nome) {
        this.nome = nome;
        totalProdutos++; // incrementa o total de produtos a cada novo objeto criado
    }

    public static void mostrarTotal() {
        System.out.println("Total: " + totalProdutos); // método static que imprime o total de produtos
    }
}
