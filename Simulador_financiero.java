//descripcion del problema: se debe de crear un programa que sea capaz de calcular cuantos años se demora llegar al capital de 10 millones utilizando el porcentaje de interes compuesto que ofrece un banco
// entradas: capital inicial, porcentaje del interes compuesto
//salidas: num de años para llegar al capital final 
//ejemplo: el usuario necesita saber cuanto tiempo le tomara lle
import java.lang.Math;
import java.util.Scanner;

public class Simulador_financiero {
	
	//@param double ciclo
	//return double
	
	public static double ciclodouble (double ci ,double r ){
	double ciclo;
	ciclo=(Math.log10(100000/ci))/(Math.log10(1+r));
	return ciclo;
	}
	
	
	//@param double resul
	//@return double resul
	
	public static double resuldouble (double ciclo ){
	double   resul;
	resul=(ciclo/12);
	return resul;
	}
//@param double aprox
//@return double aprox
    public static double aproxdouble (double resul){
	double aprox;
	aprox=Math.round(resul);
	return aprox;
	}

	
	
	public static void main(String[] args) {
		
		
	Scanner lector = new Scanner(System.in);
//
     System.out.println ("digite el capital inicial");
	  double ci= lector.nextDouble();
	 //
	 System.out.println ("digite el interes compuesto que ofrece el banco");
	//
	 double r= lector.nextDouble();
	  
	  double ciclo= ciclodouble (ci,r);
	  double resul= resuldouble(ciclo);
	  double aprox= aproxdouble (resul);
	 
	 

	 System.out.println ("el numero de periodos necesarios para llegar al capital final es de : " + aprox);

	 
	}
}