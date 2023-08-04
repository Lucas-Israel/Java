package Variaveis_e_seus_tipos;

public class DataTypes {
	
	static byte pByte = 9;
	static short pShort = 32767;
	static short pShort2 = 32_767;
	static short pShort3 = 500;
	static int pInt = 2_147_483_647;
	static int pInt2 = 5000;
	static int pInt3 = 4000;
	static long pLong = 9_223_372_036_854_775_807L;
	static float pFloat1 = -101.23f;
	static float pFloat2 = 2.356f;
	static double varDouble = 2.356; // double inicializado naturalmente
    static double doubleRecebendoFloat = 1.409F; // double aceitando número float
    static double doubleRecebendoLong = 12930L; // double aceitando número long
    static char char1 = 'a'; //Precisa ser aspas simples pra ser considerado char
    static char char2 = 'A';
	
	
    public static void main(String[] args) {
        Object[] newArr = {
        		DataTypes.typeByte(pByte),
        		DataTypes.typeShort(pShort),
        		DataTypes.typeShort(pShort2),
        		DataTypes.typeInt(pInt),
        		DataTypes.intSum(pInt2, pInt3),
        		DataTypes.typeLong(pLong),
        		DataTypes.typeFloat(pFloat1),
        		DataTypes.typeFloat(pFloat2),
        		DataTypes.floatSum(pFloat1, pFloat2),
        		DataTypes.typeDouble(varDouble),
        		DataTypes.typeDouble(doubleRecebendoFloat),
        		DataTypes.typeDouble(doubleRecebendoLong),
        		DataTypes.typeBoolean(false),
        		DataTypes.typeBoolean(true),
        		DataTypes.typeCharComparison(char1, char2),
        		DataTypes.typeCharComparison('c', 'c'),
        };
        DataTypes.loopPrint(newArr);
        DataTypes.inlineSum();
    }

	public static void loopPrint(Object[] args) {
    	for(Object arg : args) {
    		System.out.println(arg);
    	}
    }
    
//    Exercicios sobre como definir metodos.
	
//	  byte
    
    public static byte typeByte(byte number) {
    	return number;
    }
    
//    short
    
    public static short typeShort(short number) {
    	return number;
    }
    
//    int
    
    public static int typeInt(int number) {
    	return number;
    }
    
//    long
    
    public static long typeLong(long number) {
    	return number;
    }
    
//    float
//    Na inicialização de variáveis do tipo float, é necessário adicionar a letra f no final do número. 
//    O motivo é que a precisão entre float e double são diferentes. Se não inserirmos a letra f, 
//    o Java entenderá que você está tentando atribuir um valor do tipo double a uma variável do tipo float.
//    float aceita os mesmos valores do byte, short e int, além de números de ponto flutuante dentro do range float.
    
    public static String typeFloat(float number) {
    	return "Float number " + number;
    }
    
//    Double
//    O double é um tipo primitivo numérico de range -4,9E-324 até 1,7976931348623157E308. 
//    Ele é o outro tipo primitivo para utilização de números de ponto flutuante, similar ao float, porém com um range maior.
    
    public static String typeDouble(double number) {
    	return "Double number type " + number;
    }
    
//    Boolean
    
    public static String typeBoolean(boolean bool) {
    	if(bool) {
    		return "Hoje é sexta";
    	}
    	return "Hoje não é sexta";
    }
    
//    char
//    char é diferente de String
    
    public static String typeCharComparison(char char1, char char2) {
    	return char1 + " == " + char2 + " ? " + (char1 == char2);
    }
    
//   Soma de int.
    
    public static int intSum(int num1, int num2) {
    	return num1 + num2;
    }
    
//    Soma de float
    
    public static float floatSum(float num1, float num2) {
    	return num1 + num2;
    }
    
//    Declaração inline.
    
    public static void inlineSum() {
    	int numeroInteiro = 20;
    	int a = 4, b = 6, soma;
    	soma = a + b;
    	System.out.println("------- Inline Sum ----------");
    	System.out.println("Numero Inteiro " + numeroInteiro);
    	System.out.println("Somando " + soma);
    }
    
    
    
}
