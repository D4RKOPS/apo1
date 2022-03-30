 import java.util.Scanner;


public class Comparadora {
	
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido a Comparadora de 2 Enteros");
		System.out.println("digite la opereacion a realizar: 1:mayor ,2:mayor o igual ,3:menor ,4:menor igual ,5:igual ,6:diferente ");
		int num= sc.nextInt();
		System.out.println("Digite el primer entero (a)");
		int n1 = sc.nextInt();
		System.out.println("Digite el segundo entero (b)");
		int n2 = sc.nextInt();
		
    switch(num){
	        case 1: 
	         System.out.println("Resultados de la comparacion:");
	         System.out.println(" Es a mayor que b?"+(mayorQue(n1,n2)?" Si":" No"));
	
	         break;
	         case 2:
	         System.out.println("Resultados de la comparacion:");
	         System.out.println(" Es a mayor o igual que b?" +(mayorIgualQue(n1,n2)?" Si":" No"));
	         break;
	         case 3:
	         System.out.println("Resultados de la comparacion:");
	         System.out.println(" Es"" a menor que b?"+ (menorQue(n1,n2)?" Si":" No"));
	
	         break;
	         case 4:
	         System.out.println("Resultados de la comparacion:");
	         System.out.println(" Es a menor o igual que b?"+ (menorIgualQue(n1,n2)?" Si":" No"));
	         break;
	         case 5:
	         System.out.println("Resultados de la comparacion:");
	         System.out.println(" Es n1 igual que n2?"+ (igual(n1,n2)?" Si":" No"));
	         break;
	         case 6:
	         System.out.println("Resultados de la comparacion:");
	         System.out.println("Es a diferente de b?"+ (diferente(n1,n2)?" Si":" No"));
	
	         break;
        } 
	
	}
	
        

	public static boolean mayorQue(int n1, int n2) {
		boolean resultado = n1 > n2 ? true : false;
		return resultado;
	}


	public static boolean mayorIgualQue(int n1, int n2) {
		boolean resultado = n1 >= n2 ? true : false;
		return resultado;
	}


	public static boolean menorQue(int n1, int n2) {
		boolean resultado = n1 < n2 ? true : false;
		return resultado;
	}


	
	public static boolean menorIgualQue(int n1, int n2) {
		boolean resultado = n1 <= n2 ? true : false;
		return resultado;
	}


	public static boolean igual(int n1, int n2) {
		boolean resultado = n1 == n2 ? true : false;
		return resultado;
	}


	public static boolean diferente(int n1, int n2) {
		boolean resultado = n1 != n2 ? true : false;
		return resultado;
	}


}