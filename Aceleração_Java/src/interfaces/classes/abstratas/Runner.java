package interfaces.classes.abstratas;

public class Runner {

  public static void main(String[] args) {
    Senior senior = new Senior();
    Junior junior = new Junior();
    Student student = new Student();

    senior.skillfull();
    senior.myStacks();

    junior.skillfull();
    junior.myStacks();

    student.skillfull();
  }
}
