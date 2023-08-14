package tratamento.de.erros;

public class TryCatch {

  public static void main(String[] args) {
    try {
      // System.out.println(2 / 0);
      throw new RuntimeException("abc");
    } catch (ArithmeticException e) {
      System.out.println("nao pode dividir por 0");
    } catch (RuntimeException a) {
      a.printStackTrace();
    }
  }
}
