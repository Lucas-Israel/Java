package junit.examples;

public class Calculadora {

  public int soma(int a, int b) {
    return a + b;
  }

  public int subtrair(int a, int b) {
    return a - b;
  }

  public int dividir(int a, int b) {
    if (dividirCheck(b)) {
      return 0;
    }

    return a / b;
  }

  public boolean dividirCheck(int a) {
    return a == 0;
  }

  public int dividirSemCheck(int a, int b) {
    return a / b;
  }
}
