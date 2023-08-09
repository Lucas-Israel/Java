package getters.setters;

public class Runner {

  public static void main(String[] args) {
    Carro carro = new Carro("Carro1", "montadora de carro", 92);

    System.out.println(carro.getAno());
    System.out.println(carro.getMontadora());
    System.out.println(carro.getNome());
    Carro carro2 = new Carro("carro2", "outra montadora", 93);

    System.out.println(carro2.getAno());
    System.out.println(carro2.getMontadora());
    System.out.println(carro2.getNome());

    carro.setNome("mudei o nome do carro1");
    carro2.setNome("Mudei o nome do carro2");

    System.out.println(carro.getNome());
    System.out.println(carro2.getNome());
  }

}
