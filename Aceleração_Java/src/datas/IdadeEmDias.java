package datas;

import java.time.Duration;
import java.time.LocalDateTime;

public class IdadeEmDias {

  public static void main(String[] args) {

    IdadeEmDias idade = new IdadeEmDias();
    System.out.println("A quantidade de dias desde o seu nascimento é: "
        + idade.calcularIdadeEmDias("1992-09-07T09:45:00"));
  }

  public long calcularIdadeEmDias(String nascimento) {

    LocalDateTime hoje = LocalDateTime.now();
    LocalDateTime diaNascimento = LocalDateTime.parse(nascimento);

    Duration duracao = Duration.between(diaNascimento, hoje);
    System.out.println(duracao.toDays() / 365);
    return duracao.toDays();
  }

}
