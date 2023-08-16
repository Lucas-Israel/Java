package tratamento.de.erros;

public class UncheckedException extends RuntimeException {

  private static final long serialVersionUID = -3737199641311743914L;

  public UncheckedException() {
    super("Criando erro para quando ocorre no momento que roda o código.");
  }
}
