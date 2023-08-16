package tratamento.de.erros;

public class Finally {
  public static void main(String[] args) {
    try {
      int resultado = 25 / 0;
      System.out.println(resultado);
    } catch (ArithmeticException e) {
      System.out.println("Erro tratado");
      System.out.println(e);
    } finally {
      System.out.println("Bloco finally");
    }

  }

  // bloco catch é delegado para onde é chamado o metodo, não precisando criar um catch dentro dele.
  // \/

  // public static void main(String[] args) {
  // InputStream inputStream = InputStream.nullInputStream();
  // try {
  // readStream(inputStream);
  // } catch (IOException e) {
  // System.out.println(e);
  // }
  //
  // }
  //
  // private static void readStream(InputStream inputStream) throws IOException {
  // try {
  // inputStream.read();
  // } finally {
  // inputStream.close();
  // }
  // }
}
