package polimorfismo;

public class Main {

  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.abastecer();
    carro.acelerar();

    Moto moto = new Moto();
    moto.mostrar();
  }
}
