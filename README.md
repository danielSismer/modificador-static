# ✨ Modificador `static` em Java! 🚀

Bem-vindo ao repositório mais animado sobre o **modificador `static`** em Java! Aqui você vai entender de forma simples, divertida e cheia de exemplos como usar (e abusar!) do `static` no seu código. Bora aprender juntos? 😄

---

## O que é o famoso `static`? 🤔

O `static` é aquele superpoder que faz um membro da classe (variável, método, bloco ou até uma classe interna) pertencer à classe e NÃO ao objeto! Ou seja, dá pra acessar sem nem instanciar. Quer ver só?

---

## Exemplos SUPER práticos! 💡

### Variável estática: todo mundo usa a mesma! 👨‍👩‍👧‍👦

```java
public class Contador {
    public static int total = 0;
    public Contador() {
        total++;
    }
}
```
**Uso:**
```java
Contador c1 = new Contador();
Contador c2 = new Contador();
System.out.println(Contador.total); // Saída: 2
```

---

### Método estático: chama direto, sem cerimônia! 📞

```java
public class Matematica {
    public static int soma(int a, int b) {
        return a + b;
    }
}
```
**Uso:**
```java
int resultado = Matematica.soma(10, 5); // Saída: 15
```

---

### Bloco estático: executa só uma vez! ⚡

```java
public class Inicializador {
    public static String mensagem;
    static {
        mensagem = "Classe carregada!";
    }
}
```

---

### Classe interna estática: independente e cheia de atitude! 🕺

```java
public class Externa {
    static class Interna {
        void ola() {
            System.out.println("Olá do static!");
        }
    }
}
```
**Uso:**
```java
Externa.Interna obj = new Externa.Interna();
obj.ola();
```

---

## Dicas de ouro! 🏅

- Métodos/variáveis estáticos NÃO acessam membros não estáticos diretamente!
- Use `static` quando o comportamento ou dado for **comum a TODOS os objetos**.
- Não exagere no uso, senão vira bagunça! 😅

---

## Bora contribuir? 👾

Curtiu? Achou um exemplo legal? Manda um PR ou abre uma issue!  
E não esqueça de deixar sua estrela ⭐️!

---

## Licença

MIT License

---

> _Codifique com alegria!_ 🎉
