package manipulacao.de.strings;

/**
 * Classe para testar String.indexOf.
 */
public class IndexOf {

  public static void main(String[] args) {
    String texto = "abc def ghi";
    String texto2 = "abc abc abc abc";

    int exp1 = texto.indexOf('a');
    int exp2 = texto.indexOf('g');

    System.out.println(exp1);
    System.out.println(exp2);

    int exp3 = texto2.indexOf('a', 9);

    System.out.println(exp3);
  }
}
