package encapsulamento.heranca;

public class Caminhao extends Veiculo {
  private short tamanhoBau;

  public short getTamanhoBau() {
    return tamanhoBau;
  }

  public void setTamanhoBau(short tamanhoBau) {
    this.tamanhoBau = tamanhoBau;
  }

  public Caminhao(String placa, String motorista, String cor, short tamanhoBau) {
    super(placa, motorista, cor);
    this.tamanhoBau = tamanhoBau;
  }

}
