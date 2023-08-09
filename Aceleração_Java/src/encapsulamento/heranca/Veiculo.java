package encapsulamento.heranca;

public class Veiculo {
  private String placa;
  private String motorista;
  private String cor;

  public Veiculo(String placa, String motorista, String cor) {
    super();
    this.placa = placa;
    this.motorista = motorista;
    this.cor = cor;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getMotorista() {
    return motorista;
  }

  public void setMotorista(String motorista) {
    this.motorista = motorista;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }



}
