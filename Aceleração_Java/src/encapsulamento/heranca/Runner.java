package encapsulamento.heranca;

public class Runner {
  public static void main(String[] args) {
    Carro carro = new Carro("ABC", "Jorge", "Branco", (short) 4);
    Caminhao caminhao = new Caminhao("DEF", "TONI", "ROSA", (short) 7);

    System.out.println(carro.getCor());
    System.out.println(carro.getMotorista());
    System.out.println(carro.getNumeroPortas());
    System.out.println(caminhao.getMotorista());
    System.out.println(caminhao.getTamanhoBau());
  }
}
