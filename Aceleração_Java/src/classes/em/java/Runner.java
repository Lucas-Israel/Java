package classes.em.java;

public class Runner {

  public static void main(String[] args) {
    Livro livro = new Livro("Abc", 10);
    Livro livro2 = new Livro("Dev", 100);

    System.out.println(livro.name());
    System.out.println(livro2.name());
    System.out.println(livro.paginas());
    livro.paginas(200);
    System.out.println(livro.paginas());
  }
}
