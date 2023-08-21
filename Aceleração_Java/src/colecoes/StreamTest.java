package colecoes;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class StreamTest {

  public static Collection<PersonStream> obterPerson() {
    return Set.of(new PersonStream("aaa", "10", "150"), new PersonStream("bbb", "11", "160"),
        new PersonStream("ccc", "12", "170"), new PersonStream("ddd", "13", "180"),
        new PersonStream("eee", "14", "190"), new PersonStream("fff", "15", "200"));
  }

  public static void main(String[] args) {
    Collection<PersonStream> entrada = obterPerson();
    List<String> pessoa = entrada.stream().filter(e -> Integer.parseInt(e.getHeight()) > 150)
        .sorted(Comparator.comparing(PersonStream::getName)).map(PersonStream::getName).toList();
    System.out.println(pessoa);
  }
}
