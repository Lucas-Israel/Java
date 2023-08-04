package Variaveis_e_seus_tipos;

public class NonPrimitiveTypes {
	
	static String str1 = "Isso é uma string"; //precisa ser aspas duplas para indicar string
	static String str2 = "Isso é outra string";

	public static void main(String[] args) {
		Object[] newArr = {
				str1,
				str2,
				str1 +", "+ str2,
				NonPrimitiveTypes.stringBuilder(str1, str2, "abcde", "fghi"),
		};
		
		NonPrimitiveTypes.printer(newArr);
	}
	
//	printer
	
	public static void printer(Object[] args) {
		for(Object arg : args) {
			System.out.println(arg);
		}
	}
	
//	stringBuilder, é mais eficiente que concatenar com +
	
	public static String stringBuilder(String... args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (String arg : args) {
			stringBuilder.append(arg).append(" ");
		}
		
		return stringBuilder.toString();
	}
	
}
