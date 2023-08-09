package encapsulamento.heranca;

public class Carro extends Veiculo {
  private short numeroPortas;

  public Carro(String placa, String motorista, String cor, short numeroPortas) {
    super(placa, motorista, cor);
    this.numeroPortas = numeroPortas;
  }

  public short getNumeroPortas() {
    return numeroPortas;
  }

  public void setNumeroPortas(short numeroPortas) {
    this.numeroPortas = numeroPortas;
  }

}
