package colecoes;

import java.util.HashMap;

public class MapExemplos {
  // Mapas podem ser mutáveis ou imutáveis. Semelhante ao List.of, que cria listas imutáveis, existe
  // o Map.of.

  /**
   * Main para rodar os testes.
   */
  public static void main(String[] args) {
    var estudantes = new HashMap<String, String>();
    // adicionando chave: valor
    estudantes.put("x038702", "João");
    estudantes.put("x784244", "Maria");
    estudantes.put("x105852", "Joana");
    String valorAnterior = estudantes.put("x038702", "José"); // Mesma matricula usada no mapeamento
                                                              // com João
    System.out.println("Valor anterior de x038702: " + valorAnterior);
    System.out.println("Estudantes: " + estudantes);

    // pegando valor pela chave.
    System.out.println(estudantes.get("x105852"));

    // deletando pela chave
    estudantes.remove("x038702");
    estudantes.remove("x784244");
    System.out.println(estudantes);

    System.out.println(estudantes.put("x105852", "Brasil"));
    System.out.println(estudantes);
  }
}
