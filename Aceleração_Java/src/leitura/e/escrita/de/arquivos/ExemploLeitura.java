package leitura.e.escrita.de.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeitura {
  private static final String caminhoArquivo = "/path/to/some/file.txt";

  public void lerConteudoArquivo() {
    File meuArquivo = new File(caminhoArquivo);
    // leitura do arquivo \/
    FileReader leitorArquivo = null;

    // espaço de memoria \/
    BufferedReader bufferedLeitor = null;

    // loop enquanto o arquivo não é null \/
    if (meuArquivo.exists()) {
      try {
        leitorArquivo = new FileReader(meuArquivo);
        bufferedLeitor = new BufferedReader(leitorArquivo);

        String conteudoLinha = bufferedLeitor.readLine();

        while (conteudoLinha != null) {
          System.out.println(conteudoLinha);
          conteudoLinha = bufferedLeitor.readLine();
        }

      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        // depois de tudo, em qualquer ocasião fecha o arquivo pelo metodo invocado no finally
        this.fecharObjetos(leitorArquivo, bufferedLeitor);
      }
    }
  }

  private void fecharObjetos(FileReader fileReader, BufferedReader bufferedReader) {
    try {
      fileReader.close();
      bufferedReader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
