 //Entradas: personas,dias,transporte, ida y vuelta, hospedaje, vip
 //Salidas:costopaquete,costovip,descuento,valorservicio
 import java.util.Scanner;


public class Eventoatlas {
	
	public static double cf=0;
	
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido a Evento atlas");
		System.out.println("digite la cantidad de personas que planean comprar la boleta");
		int npersonas= sc.nextInt();
		
		System.out.println("desea transportarse con nosotros al evento? 1:si,2:no");
		int pregtrans= sc.nextInt();
		
		
		System.out.println("desea alojarse con atlas durante el evento? 1:si,2:no");
		int pregaloj = sc.nextInt();
		System.out.println("digite cual de los 2 tipos de boleta va a adquirir 1: 1 dia(valor de  $690.000) 2:3 dias(valor de $1’690.000.) ");
		int ndb= sc.nextInt();
		
		System.out.println("desea agregar el paquete vip a su boleta? 1:si 2:no");
		int pregvip= sc.nextInt();
		
		
		
	     
		
		
    switch(ndb){
	        case 1: 
	          cf+= 690000;
			 
	
	         break;
	         case 2:
	          cf+= 1690000;
	         break;
	         
        } 
		int tiptrans=0;
		  switch(pregtrans){
	        case 1: 
	         System.out.println("digiten en que medio de transporte desea ir al evento: 1:bus($90000 ) 2:avion($125000) ");
		      tiptrans = sc.nextInt();
		     
	         break;
	         case 2:
	          cf+= 0;
	         break;
	         
        } 
		double ptrans= 0;
		int pregi=0; 
		switch (tiptrans){
	        case 1: 
	         ptrans= 90000;
			 System.out.println("desea que el viaje sea ida y vuelta o solo ida? 1:ida y vuelta 2: ida (tenga en cuenta que el precio de la boleta se duplicara) ");
		     pregi = sc.nextInt();
	
	         break;
	         case 2:
	         ptrans= 125000;
			 System.out.println("desea que el viaje sea ida y vuelta o solo ida? 1:ida y vuelta 2: ida (tenga en cuenta que el precio de la boleta se duplicara) ");
		     pregi = sc.nextInt();
	         break;
	         
        } 
	
	
	     switch(pregi){
	        case 1: 
	          cf+=(ptrans*2);
		     
	         break;
	         case 2:
	          cf+= ptrans;
	         break;
		 }
	
	      switch(pregaloj){
	        case 1: 
	         System.out.println("digite el numero de noches que desea alojarse (tenga en cuenta que cada noche tiene un valor de 100000) ");
		     int nnoches = sc.nextInt();
			 int pnoches= (nnoches*100000);
			  cf+=pnoches;
			 
		     
	         break;
	         case 2:
	          cf+= 0;
	         break;
		  }
	
	  cf+=(cf*npersonas);
	  double pdesc= 0;
	  double tbol= 0;
	  double desct=0;
	 
	  if (npersonas>=3){
		  int desc=(npersonas/3);
		  pdesc=(desc*5);
		  
		  desct=(cf*pdesc)/100;
		  tbol=(cf-desct);
	  }
	  
	 double vippor=(tbol*25)/100;
	 double vip=(tbol+vippor);
	 
	  double empresavip=(vip*15)/100;
	 double empresanovip=(cf*15)/100;
	 switch(pregvip){
	        case 1: 
	         System.out.println(" el valor total de su boleta incluyendo el costo vip es de "+ empresavip);
		    
			 
		     
	         break;
	         case 2:
	         System.out.println(" el valor total de su boleta  es de "+ empresanovip); 
	         break;
		  }
		  
	
	}
}
