package polimorfismo;

public class Carro extends Veiculo {

  private String modelo;

  @Override
  public void acelerar() {
    System.out.println("Método acelerar da classe Carro.");
  }
}
