package classes.em.java;

public class Livro {
  private String name;
  private int paginas;

  Livro(String name, int paginas) {
    this.name = name;
    this.paginas = paginas;
  }

  public String name() {
    return this.name;
  }

  public void name(String name) {
    this.name = name;
  }

  public int paginas() {
    return this.paginas;
  }

  public void paginas(int paginas) {
    this.paginas = paginas;
  }
}
