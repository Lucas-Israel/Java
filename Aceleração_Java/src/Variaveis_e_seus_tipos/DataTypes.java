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
	
	
    public static void main(String[] args) {
        Object[] newArr = {
        		DataTypes.typeByte(pByte),
        		DataTypes.typeShort(pShort),
        		DataTypes.typeShort(pShort2),
        		DataTypes.typeInt(pInt),
        		DataTypes.intSum(pInt2, pInt3),
        		DataTypes.typeLong(pLong)
        };
        DataTypes.loopPrint(newArr);
    }

	public static void loopPrint(Object[] args) {
    	for(Object arg : args) {
    		System.out.println(arg);
    	}
    }
    
//    Exercicios sobre como definir metodos.
    
    public static byte typeByte(byte number) {
    	return number;
    }
    
    public static short typeShort(short number) {
    	return number;
    }
    
    public static int typeInt(int number) {
    	return number;
    }
    
    public static long typeLong(long number) {
    	return number;
    }
    
    
//   Soma de int.
    
    public static int intSum(int num1, int num2) {
    	return num1 + num2;
    }
    
    
    
}
