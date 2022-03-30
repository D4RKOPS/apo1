 import java.util.Scanner;

 public class Picoycedula {//
 
 public static double trunkDouble (double ced){
 
 double trunk;
 trunk= (ced%2);
return trunk;
 } 
 public static void main(String[] args) {
	
	 Scanner lector = new Scanner(System.in);
	  
	 System.out.println ("digite el ultimo numero de su cedula");
	 
	 double ced= lector.nextDouble();
	 System.out.println ("digite el dia que quiere salir");
	 
	 double d= lector.nextDouble();
	
	
	
	 double par = trunkDouble(ced);
	 double dia = trunkDouble(d);
	 if ((par==0 && dia==0) || (par!=0 && dia!=0))  {
		  System.out.println ("usted puede salir el dia "+ d) ;
	 }  else {
			  System.out.println ("no puede salir el dia" + d);
		 }
	
 

 
 
 
	  
	
 }
 }