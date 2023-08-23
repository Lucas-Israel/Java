package datas;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Academia {

  /**
   * Verifica se é dia de ir na academia, segunda, quarta e sexta.
   */
  public void verificarDiaAcademia() {

    String diaDeAcademia = "Hoje é dia de academia!";

    LocalDateTime hoje = LocalDateTime.now();
    if (hoje.getDayOfWeek() == DayOfWeek.MONDAY) {
      System.out.println(diaDeAcademia);
    } else if (hoje.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
      System.out.println(diaDeAcademia + "IT IS WEDNESDAY MY DUDES!!!");
    } else if (hoje.getDayOfWeek() == DayOfWeek.FRIDAY) {
      System.out.println(diaDeAcademia);
    } else {
      System.out.println("Hoje não é dia de academia!");
    }
  }

  public static void main(String[] args) {
    Academia agenda = new Academia();
    agenda.verificarDiaAcademia();
  }
}
