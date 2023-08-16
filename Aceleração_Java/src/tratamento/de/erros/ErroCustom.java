package tratamento.de.erros;

public class ErroCustom extends Exception {

  // no momento não sei pra que serve serialVersionUID. 16/08/23 13:33H gerado automaticamente pelo
  // IDE
  private static final long serialVersionUID = -9084691677907147191L;

  public ErroCustom() {
    super("Esse é a forma de determinar um erro custom");
  }
}
