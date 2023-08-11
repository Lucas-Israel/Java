package manipulacao.de.strings;


/**
 * Classe para testar String.replace.
 */
public class Replace {

  /**
   * main para rodar os testes.
   */
  public static void main(String[] args) {
    String texto = "abcdefghi\n";

    System.out.println(texto);

    // ----- replace não muta o original -----
    String textoReplaced = texto.replace('a', 'A');

    System.out.println(textoReplaced);

    // ----- replaceall não muta o original e pode receber regex ----
    String replaceAll = texto.replaceAll("\\w+", "ABCDEFGHI\n");

    System.out.println(replaceAll);
  }
}
