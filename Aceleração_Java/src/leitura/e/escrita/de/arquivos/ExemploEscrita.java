package leitura.e.escrita.de.arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploEscrita {

  private static final String caminhoArquivo = "/path/to/some/file.txt";

  public void escreverConteudoNoArquivo() {
    File meuArquivo = new File(caminhoArquivo);

    FileWriter escritorArquivo = null;
    BufferedWriter bufferedEscritor = null;

    try {
      escritorArquivo = new FileWriter(meuArquivo);
      bufferedEscritor = new BufferedWriter(escritorArquivo); // Criando objeto que armazena o
                                                              // conteudo que será escrito em um
                                                              // buffer de memória
      bufferedEscritor.write("Oi, estou escrevendo um texto no arquivo"); // Inserindo o contéudo
                                                                          // que será escrito ao
                                                                          // buffer.
      bufferedEscritor.flush(); // Obtendo o conteudo do bufferd e escrevendo no arquivo.

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      this.fecharObjetos(escritorArquivo, bufferedEscritor);
    }
  }

  private void fecharObjetos(FileWriter escritorArquivo, BufferedWriter bufferedEscritor) {
    try {
      escritorArquivo.close();
      bufferedEscritor.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
