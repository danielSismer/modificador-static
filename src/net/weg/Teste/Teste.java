package net.weg.Teste;

public class Teste {
    int numero = 5; // variável de instância.

    public static void imprimirNumero() { // método estático
       System.out.println(numero); // Erro: não é possível acessar variável de instância 'numero' a partir do método static
    }
}

/*para ajustar, devemos tornar o método imprimirNumero não estático, ou tornar a variável numero estática.*/



/* EXEMPLO USANDO MÉTODO NÃO ESTÁTICO*/

/*package net.weg.Teste;

public class Teste {
    int numero = 5; // variável de instância.

    public void imprimirNumero() { // método estático
        System.out.println(numero); // Erro: não é possível acessar variável de instância 'numero' a partir do método static
    }
}

*/

/* EXEMPLO USANDO VARIÁVEL ESTÁTICA */

/*package net.weg.Teste;

public class Teste {
    static int numero = 5; // variável estática.

    public static void imprimirNumero() { // método estático
        System.out.println(numero); // agora é possível acessar a variável estática 'numero'
    }
 */

