package hello.world;

import java.util.Scanner;

class UsandoScanner {

//    public static void main(String[] args) {
//    
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Qual o seu nome: ");
//        String nome = scanner.next();
//        System.out.println("Boas-vindas, " + nome + "!");
//        scanner.close();
//    
//    }
	
//    public static void main(String[] args) {
//        
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Entre com o primeiro número: ");
//        String input1 = scanner.next();
//        System.out.print("Entre com o segundo número: ");
//        String input2 = scanner.next();
//
//    	int n1 = Integer.parseInt(input1);
//	    int n2 = Integer.parseInt(input2);
//
//        int resultado = n1 + n2;
//        System.out.println("O resultado da soma é: " + resultado);
//        scanner.close();
//    }
	
//	  public static void main(String[] args) {
//
//		    Scanner scanner = new Scanner(System.in);
//		    System.out.print("Entre com a sua idade: ");
//		    String input1 = scanner.next();
//		    scanner.close();
//
//		    short idade = Short.parseShort(input1);
//
//		    short resultado = idade;
//		    resultado++;
//
//		    System.out.println("Daqui a um ano sua idade será: " + resultado);
//		    
//		  }
	
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o preço do litro da gasolina: ");
        String input1 = scanner.next();
        scanner.close();
    
	float gasolina = Float.parseFloat(input1);

        float resultado = gasolina + gasolina;
        System.out.println("Ano que vem o litro da gasolina vai custar: " + resultado);
    
    }

}