package net.weg.ClassA;

public class ClasseA {
    int valor = 100;

    public static void mostrarValor() {
       System.out.println(valor);
    }
}

// erro de compilação:
// o metodo estatico esta tentando acessar um atributo nao estatico (valor) diretamente.

// Para corrigir isso, você pode tornar o atributo valor estático ou tornar o método mostrarValor não estático.
