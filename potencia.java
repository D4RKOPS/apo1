import java.util.Scanner;

public class Potencia {
	public static double resulpotencia=0;
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
	  
		System.out.println("bienvenido a la calculadora de potencias");
		System.out.println("digite el numero a potenciar");
		double base=lector.nextDouble();
		System.out.println("digite la potencia del numero");
		double exponente=lector.nextDouble();

		for(int i=1; i<=exponente ;i++) {

			resulpotencia=(base*base);	


		}


		System.out.println("el resultado de la potencia es: "+resulpotencia);

	}


	
}


 
 