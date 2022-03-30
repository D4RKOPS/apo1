 
 //descripcion del problrma: se debe de crear un programa con fines recreativos en este caso a adivinar el numero, el programa debe ser capaz de generar un numero aleatorio del 1 al 100, decirle al usuario si el numero que escribio es mayor o menor al numero aleatorio y debe de contar con un maximo de 10 intentos para el usuario
 //entradas:numero del usuario,numero de intentos
 //salidas:numero generado por el sistemas
 //ejemplo:un usuario desea jugar a adivinar el numero por lo que utiliza el programa para adivinar el numero que genera el sistema
 package ui;
    import java.util.Random;
 import java.util.Scanner;
 
 
 public class Numberguesser{
	  
	 
	 public static double nintent=0;
	 public static double nusuario=0;
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	  System.out.println("bienvenido a numberguesser");
	  System.out.println("el sistema generara un numero aleatorio del 1 al 100 y usted debera adivinarlo");
	  

		
	  Random rd=new Random();
	  int numa= rd.nextInt(99)+1;
	   
	  boolean comp = false;
	  double cont=0;

	  
	  for (int i=1; i<11 && !comp ;i++) {
		 
		 	  System.out.println("escriba un numero del 1 al 100");
               int nusuario= sc.nextInt();
	  
			if (nusuario>numa){
	  System.out.println("digita un numero menor");
			} else if (nusuario<numa){
		   System.out.println("digita un numero mayor");
			}
			if (nusuario==numa){
				comp = true;
			System.out.println("acertaste el numero");
			}  
			if (i==10){
			System.out.println("se han acabado sus intentos");
			}
	  }
	  
		 System.out.println("el numero generado por el sistema fue "+ numa);
	 }
	 
	 
 }

 

 