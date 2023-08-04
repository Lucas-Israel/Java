package Variaveis_e_seus_tipos;

/**
 * Classe para if e else.
 */

public class IfAndElses {

	static double mediaFinal = 7.5;
	static double mediaFinal2 = 5.0;
	static double mediaFinal3 = 6.1;

    /**
     * main que chama outros metodos de classe.
     */

	public static void main(String[] args) {
		Object[] newArr = {
				IfAndElses.aproval(mediaFinal),
				IfAndElses.aproval(mediaFinal2),
				IfAndElses.aproval(mediaFinal3),
		};
		
		IfAndElses.printer(newArr);
	}
	
	/**
	 * Printer in loop.
	 * @param args
	 */
	
	public static void printer(Object[] args) {
      for (Object arg : args) {
    	  System.out.println(arg);
      }
	}

    /**
     * medoto de condição para ver se esta aprovado.
     * @param double number.
     * @return "Aprovado" ou "Reprovado"
     */

	public static String aproval(double arg) {
		String resultado;
		if (arg >= 7) {
			   resultado = "APROVADA";
			} else if (arg >= 6.0) {
			    resultado = "REALIZAR PROVA BONUS";
			} else {
			   resultado = "REPROVADA";
			}
		return resultado;
	}
}
