
// Meu primeiro programa em JAVA
// Simples calculadora em JAVA
import java.util.Scanner;

public class calculadora {

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      int a, b;

      System.out.println("Digite o primeiro valor: ");
      a = scan.nextInt();
      System.out.println("Digite o segundo valor: ");
      b = scan.nextInt();

      int soma = soma(a, b);
      int subtracao = subtracao(a, b);
      int multiplicacao = multiplicacao(a, b);
      int divisao = divisao(a, b);

      System.out.println("Resultado da soma: " + soma);
      System.out.println("Resultado da sub.: " + subtracao);
      System.out.println("Resultado da mult.: " + multiplicacao);
      System.out.println("Resultado da div.: " + divisao);
    }
  }

  public static int soma(int a, int b) {
    return a + b;
  }

  public static int subtracao(int a, int b) {
    return a - b;
  }

  public static int divisao(int a, int b) {
    return a / b;
  }

  public static int multiplicacao(int a, int b) {
    return a * b;
  }
}
