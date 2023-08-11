package manipulacao.de.strings;

/**
 * Classe para testar String.split.
 */
public class Split {

  public static void main(String[] args) {

    String texto = "Grifinória;Sonseria;Corvinal;Lufa-Lufa\n";
    // ----- split funcionando com puro String -----
    String[] casas = texto.split(";");

    for (String casa : casas) {
      System.out.println(casa);
    }

    String casasTexto = "Grifinória123Sonseria456Corvinal789Lufa-Lufa\n";
    // ----- split funcionando com regex -----
    String[] casas2 = casasTexto.split("\\d+");

    for (String casa : casas2) {
      System.out.println(casa);
    }

    String testeLimite = "caneta,lápis,lapiseira,caderno,borracha\n";
    // ----- split funcionando com limite ate onde pode agir -----
    // ----- funciona ate antes do limite proposto -----
    String[] limitado = testeLimite.split(",", 3);

    for (String limite : limitado) {
      System.out.println(limite);
    }

    // ----- testando com valores negativos -----
    String newText = "boo:and:foo\n";
    String[] newArr = newText.split(":", 0);

    for (String item : newArr) {
      System.out.println(item);
    }

    String[] items2 = newText.split("o", -2);

    for (String item : items2) {
      System.out.println(item);
    }
  }
}
