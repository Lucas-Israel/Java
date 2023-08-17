package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Classe mostrando o funcionamento de uma lista.
 */
public class List {

  /**
   * main para rodar os testes.
   */
  public static void main(String[] args) {
    var numeros = new ArrayList<Integer>();
    numeros.add(7);
    numeros.add(2);
    numeros.add(1);
    numeros.add(9);
    System.out.println(numeros);
    // [7, 2, 1, 9]

    Collections.sort(numeros);
    // mutou o array de numeros com sort

    System.out.println(numeros);
    // [1, 2, 7, 9]

    numeros.add(3);
    System.out.println(numeros);
    // [1, 2, 7, 9, 3]

    // implementacao do list \/
    String[] arrayDeEstudantes = new String[] {"João", "Maria", "Pedro", "Rosa"};
    java.util.List<String> estudantes = Arrays.asList(arrayDeEstudantes);
    System.out.println(estudantes);
    // [João, Maria, Pedro, Rosa]

    // List.of é imutavel
    var estudantes2 = java.util.List.of("João", "Maria", "Pedro", "Rosa");
    String estudanteDoIndice2 = estudantes2.get(2);
    System.out.println(estudanteDoIndice2);
    // Pedro

    // Array é mutavel
    var estudantes3 = Arrays.asList("João", "Maria", "Pedro", "Rosa");
    estudantes3.set(0, "Joana");
    System.out.println(estudantes3);
    // [João, Maria, Pedro, Rosa] antes
    // [Joana, Maria, Pedro, Rosa] depois
    // colocou joana no lugar de joao

    // O Arrays.asList retorna uma lista de tamanho fixo, cujos valores são mutáveis.
    // Para adicionar ou remover elementos, podemos criar explicitamente um ArrayList a partir da
    // nossa lista.

    var estudantes4 = new ArrayList<String>(Arrays.asList("João", "Maria", "Pedro", "Rosa"));
    estudantes4.add("Joana");
    System.out.println(estudantes4);
    // [João, Maria, Pedro, Rosa, Joana]

    // removendo tanto pelo indice quanto pelo conteudo
    var estudantes5 = new ArrayList<String>(Arrays.asList("João", "Maria", "Pedro", "Rosa"));
    estudantes5.remove(1);
    System.out.println(estudantes5);
    estudantes5.remove("Pedro");
    System.out.println(estudantes5);
    // [João, Pedro, Rosa]
    // [João, Rosa]

    // verificando tamanho da lista
    System.out.println(estudantes5.size());

    // verificando se existe X conteudo na lista
    System.out.println(estudantes5.contains("João"));
  }
}
