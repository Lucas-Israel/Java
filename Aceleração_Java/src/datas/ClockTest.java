package datas;

import java.time.Clock;
import java.time.LocalDateTime;

public class ClockTest {

  /**
   * Main para testar clock.
   */
  public static void main(String[] args) {

    // data global
    Clock relogio = Clock.systemDefaultZone();
    System.out.println(relogio.instant());

    // data local
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);

    // criando uma data apartir de uma string
    LocalDateTime diaSofrimento = LocalDateTime.parse("2014-07-08T17:00:00");
    System.out.println(diaSofrimento);
  }
}
