package net.weg.ONE;

public class Teste {
    static int total = 0; // variável estática, compartilhada entre todas as instâncias da classe

    public void incrementar() { // método não estático que incrementa o total
        total++;
    }

    public static void main(String[] args) {
        Teste t1 = new Teste(); // cria uma instância de Teste
        Teste t2 = new Teste(); // cria outra instância de Teste
        t1.incrementar(); // chama o método incrementar na instância t1
        t2.incrementar(); // chama o método incrementar na instância t2
        System.out.println(Teste.total); // imprime o valor da variável estática total, que deve ser 2
    }
}

//  t1.incrementar(); e  t2.incrementar(); sao chamados pois o incrementar nao esta no construtor.