package manipulacao.de.strings;

/**
 * Classe para testar String.toUpperCase.
 */
public class Maiusculas {

  public static void main(String[] args) {
    String texto = "abcdef\n";
    String maior = texto.toUpperCase();

    // ----- não é mutavel -----
    System.out.println(maior);
    System.out.println(texto);
  }
}
