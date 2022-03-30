 import java.util.Scanner;
 //descripcion:se crea un programa que sea capaz de railzar operaciones simples tales como 
                           //suma,resta,multiplicacion divicion y modulo, interactuando con el usuario pidiendole a este los 2 numeros necesarios y la operacion a realizar
 //entradas:double num1,num2
 //salidas:double,suma,resta,multiplicacion,divicion,modulo
 //ejemplo: el usuario necesita saber el resultado de una divicion por lo que usa el progrma para encontrar el resultado siendo n1 10 y n2 5
 public class calculadora {// 
	 
	public static void main(String[] args) {
	
	 Scanner lector = new Scanner(System.in);
	  
	 System.out.println ("digite el primer numero a operar");//aqui le pedimos al usuario el primer numero
	 
	 double num1= lector.nextDouble();// lo guardamos en un double NOTA:cuando se guarde la variable al lado de lector se pone next."y el lector que hayamos escogido"
	 
	 System.out.println ("digite el segundo nuemero a operar");
	
	 double num2= lector.nextDouble();
	 
     double suma1= num1+num2;// aqui estamos declarando variables
	 double resta1= num1-num2;
	 double multi1= num1/num2;
	 double div1= num1*num2;
	 double mod1= num1%num2;
	 
	 
	
	
	 
	 System.out.println ("el resultado de la suma es: " +suma1 );// esto aqui es para mostrar en pantalla los resultados, no es necesario poner el double
	  System.out.println ("el resultado de la resta es: " +resta1 );
	  System.out.println ("el resultado de la multiplicacion es: " + multi1 );
	  System.out.println ("el resultado de la divicion es: " +div1 );
	  System.out.println ("el resultado de el modulo es: " +mod1 );
	  
	}
	
 }	