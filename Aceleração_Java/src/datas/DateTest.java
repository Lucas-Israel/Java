package datas;

import java.time.LocalDate;
import java.time.Month;

public class DateTest {

  /**
   * Main que checa o dia.
   * 
   */
  public static void main(String[] args) {

    // passar o dia em string no formato YYYY-MM-DD
    checarData("2023-08-22");
    checarData("2023-08-23");
    checarData("2023-08-24");

    int dia = LocalDate.now().getDayOfMonth();
    Month mes = LocalDate.now().getMonth();
    int ano = LocalDate.now().getYear();

    System.out.println(dia);
    System.out.println(mes);
    System.out.println(ano);
  }

  /**
   * Metodo para checar dia.
   * 
   * @param data no formato YYYY-MM-DD
   */
  static void checarData(String data) {
    LocalDate hoje = LocalDate.now();
    LocalDate checar = LocalDate.parse(data);

    if (hoje.isAfter(checar)) {
      System.out.println("Passamos do dia");
    } else if (hoje.isBefore(checar)) {
      System.out.println("Ainda não estamos no dia");
    } else if (hoje.isEqual(checar)) {
      System.out.println("É hoje");
    }
  }
}
