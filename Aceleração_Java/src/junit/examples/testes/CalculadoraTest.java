package junit.examples.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import junit.examples.Calculadora;

@DisplayName("Testes de calculadora")
class CalculadoraTest {

  @Test
  @DisplayName("1 - Teste para soma da calculadora")
  void testSomar() {
    Calculadora calc = new Calculadora();

    assertEquals(2, calc.soma(1, 1));
  }

  @Test
  @DisplayName("2 - Teste para subtração da calculadora")
  void testSubtrair() {
    Calculadora calc = new Calculadora();

    assertEquals(2, calc.subtrair(4, 2));
  }

  @Test
  @DisplayName("3 - Teste para divisão")
  void testDividir() {
    Calculadora calc = new Calculadora();

    assertEquals(2, calc.dividir(4, 2));
  }

  @Test
  @DisplayName("4 - Teste divisão por 0")
  void testDividirZero() {
    Calculadora calc = new Calculadora();

    assertEquals(0, calc.dividir(4, 0));
  }

  @Test
  @DisplayName("5 - Testando o checador de divisão")
  void testDivisorCheck() {
    Calculadora calc = new Calculadora();

    assertTrue(calc.dividirCheck(0));
  }

  @Test
  @DisplayName("6 - Test de exceção")
  void testDivisaoSemCheck() {
    Calculadora calc = new Calculadora();

    assertThrows(ArithmeticException.class, () -> calc.dividirSemCheck(3, 0));
  }

  @Test
  @DisplayName("7 - Coverage de dividirSemCheck")
  void testDivisaoSemCheckCoverage() {
    Calculadora calc = new Calculadora();

    assertEquals(2, calc.dividirSemCheck(4, 2));
  }

}
