 import java.util.Scanner;
 //descripcion:se crea un programa que sea capaz de railzar operaciones simples tales como 
                           //suma,resta,multiplicacion divicion y modulo, interactuando con el usuario pidiendole a este los 2 numeros necesarios y la operacion a realizar
 //entradas:double num1,num2
 //salidas:double,suma,resta,multiplicacion,divicion,modulo
 //ejemplo: el usuario necesita saber el resultado de una divicion por lo que usa el progrma para encontrar el resultado siendo n1 10 y n2 5
 public class calculadora2 {// 
 
	 
	public static int sumarint(int n1,int n2) {
		int suma;
		suma=n1+n2;
		return suma;
		
	}
		
	
	 	public static void main(String[] args) {
	 
	 Scanner lector = new Scanner(System.in);
	  
	 System.out.println ("digite el primer numero a operar");//aqui le pedimos al usuario el primer numero
	 
	 int n1= lector.nextInt();// lo guardamos en un double NOTA:cuando se guarde la variable al lado de lector se pone next."y el lector que hayamos escogido"
	 
	 System.out.println ("digite el segundo nuemero a operar");
	
	 int n2= lector.nextInt();
	 
    
	
	
	 
	 System.out.println ("el resultado de la suma es: " +sumarint(n1,n2));// esto aqui es para mostrar en pantalla los resultados, no es necesario poner el double
	 
	  
	}
	
 }	