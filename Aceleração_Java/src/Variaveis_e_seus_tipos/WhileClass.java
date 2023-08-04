package Variaveis_e_seus_tipos;


/**
 *Classe para testar while.
 */

public class WhileClass {

  /**
   * main para chamar metodos.
   * @param args
   */

  public static void main(String[] args) {
    Object[] newArr = {
    	0,
    	1,
    	2,
    	3,
    	'a',
    	'b',
    	'c',
    };
    WhileClass.printer(newArr);
  }
  
  /**
   * printer loop method with while.
   */
  public static void printer(Object[] args) {
	  int counter = 0;
	  while (counter < args.length) {
		  System.out.println(args[counter]);
		  counter += 1;
	  }
  }
  
  
}
