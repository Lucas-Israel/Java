package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OperacoesStream {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(10);

    // soma os numeros pares da lista
    // usando filter e reduce do stream
    int soma = list.stream().filter(num -> num % 2 == 0).reduce(0, (acc, num) -> acc + num);

    System.out.println("soma = " + soma + "\n--------------");

    Collection<String> nomes = List.of("a", "b", "b", "c", "c", "c", "d");
    long nomesDistintos = nomes.stream().distinct().count();
    System.out.println("nomes distintos: " + nomesDistintos + "\n--------------");
  }
}
