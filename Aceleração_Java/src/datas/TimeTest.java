package datas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeTest {

  /**
   * main que checa o horario.
   * 
   */
  public static void main(String[] args) {
    // passar string como 15:00:00
    checarHora("15:05:00");

    // duração do dia
    Duration duracao = Duration.ofDays(1);

    // em segundos

    long diaEmSegundos = duracao.getSeconds();

    System.out.println(duracao);
    System.out.println(diaEmSegundos);

    LocalDateTime hoje = LocalDateTime.now();
    LocalDateTime diaPassado = LocalDateTime.parse("2021-12-20T17:00:00");

    Duration duracao2 = Duration.between(hoje, diaPassado);
    System.out.println(duracao2.toDays());
  }

  /**
   * Metodo para checar horario.
   * 
   * @param checarHora horario a ser passado
   */
  static void checarHora(String checarHora) {
    LocalTime hora = LocalTime.now();
    LocalTime target = LocalTime.parse(checarHora);

    System.out.println(hora);

    if (hora.isAfter(target)) {
      System.out.println("Ja passou da hora");
    } else {
      System.out.println("Ainda não passou da hora");
    }
  }
}
