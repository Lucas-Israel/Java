package getters.setters;

public class Carro {
  private String nome;
  private String montadora;
  private int ano;

  Carro(String nome, String montadora, int ano) {
    this.nome = nome;
    this.montadora = montadora;
    this.ano = ano;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMontadora() {
    return montadora;
  }

  public void setMontadora(String montadora) {
    this.montadora = montadora;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

}
