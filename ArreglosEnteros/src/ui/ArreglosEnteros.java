package ui;

import java.util.Scanner;
	public class ArreglosEnteros{
		
		public static int tamanoArreglo=0;
		
		public static int [] array;
		public static int [] array2;
		
		
		public static void inicializadorArreglo(int tamanoArreglo){
		
		array = new int[tamanoArreglo];
		array2 = new int [tamanoArreglo];
		
		}
		
		public static void mostrarArreglo(int [] array,int [] array2){
			
			System.out.println("el contenido del arreglo 1 es:");
			for(int i=0;  i<array.length ;i++){
				
			  System.out.println(array[i]);
				
			}
				System.out.println("el contenido del arreglo 2 es:");
			for(int i=0;  i<array2.length ;i++){
				
			  System.out.println(array2[i]);
				
			}
				
			
			
			
		}
		
	    
		
	
	public static void main (String[]args){
		Scanner lector = new Scanner(System.in);
		System.out.println ("bienvenido al programa de arreglos enteros");
		
		System.out.println ("indique de que tamano desea que sea el arreglo");
		tamanoArreglo=lector.nextInt();
		
		inicializadorArreglo(tamanoArreglo);
		
		System.out.println ("indique lo que desea hacer:\n1.mostrar el contenido del arreglo\n2.modificar la posicion del arreglo\n3:modificar las posiciones del arreglo");
		int opcionesprincipales=lector.nextInt();
	
	switch(opcionesprincipales){
		case 1:
	     mostrarArreglo(array,array2);
		 
			break;
	
		case 2:
			break;
	
		case 3:
			System.out.println ("indique que tipo de posicion desea cambiar:\n1.una posicion\n2.todas las posiciones\n3.pares e impares ");
			int opcionesposicion=lector.nextInt();
			break;
	
	}
	
	
	}
	
 }
 
