package net.weg.Exemplo;

public class Exemplo {

    public static int contador = 0; // atributo estático

    public Exemplo() {
        contador++; // incrementador, incrementa contador++ a cada objeto criado
    }

    public static void main(String[] args) {
        new Exemplo(); // cria um objeto Exemplo, incrementando o contador
        new Exemplo(); // cria outro objeto Exemplo, incrementando o contador novamente
        System.out.println(Exemplo.contador); // imprime o valor do contador, que deve ser 2
    }
}


