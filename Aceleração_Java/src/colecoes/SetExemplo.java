package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Classe para exemplo de set.
 */
public class SetExemplo {

  // set nao tem ordem dos elementos e apenas elementos unicos
  /**
   * main com os testes de set.
   */
  public static void main(String[] args) {
    var numeros = new TreeSet<Integer>();
    numeros.add(7);
    numeros.add(2);
    numeros.add(7);
    numeros.add(9);
    System.out.println(numeros);

    // criacao de set imutaveis
    var estudantes = Set.of("João", "Maria", "Pedro", "Rosa");
    // var addAbc = estudantes.add("ABC");
    // causa erro UnsupportedOperationException /\
    System.out.println(estudantes);

    // criacao de set mutaveis
    var estudantes2 = new HashSet<>();
    var adicionouJoao = estudantes2.add("João");
    var adicionouJoaoDeNovo = estudantes2.add("João");
    var adicionouMaria = estudantes2.add("Maria");
    System.out.println(String.format("adicionouJoao: %b", adicionouJoao));
    System.out.println(String.format("adicionouJoaoDeNovo: %b", adicionouJoaoDeNovo));
    System.out.println(String.format("adicionouMaria: %b", adicionouMaria));
    // adicionouJoao: true
    // adicionouJoaoDeNovo: false
    // adicionouMaria: true

    System.out.println(estudantes2.contains("Maria"));
    // retorna true
  }
}
