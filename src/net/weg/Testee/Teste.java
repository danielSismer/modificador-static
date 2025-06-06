package net.weg.Testee;

public class Teste {
    static int x = 5; // variável estática

    public static void alterar() { // método estático que altera o valor de x
        x += 10; // incrementa x em 10
    }

    public static void main(String[] args) {

        alterar(); // chama o método estático alterar, que incrementa x em 10
        System.out.println(x); // imprime o valor de x, que deve ser 15
    }
}

// IMPORTANTE!!! O método alterar só esta sendo chamado sem o nome da classe pois estão na mesma clase, pois se dividir em packages diferentes há a necessidade de chamar o método estático com o nome da classe, como por exemplo: Teste.alterar();

