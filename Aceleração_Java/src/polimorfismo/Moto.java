package polimorfismo;

public class Moto extends Veiculo {

  private String modelo;

  @Override
  public void acelerar() {
    System.out.println("Método acelerar da classe Moto.");
  }

  public void mostrar() {
    super.acelerar();
    this.acelerar();
  }
}
