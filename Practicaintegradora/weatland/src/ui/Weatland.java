//description:this program is for administrate a wetland, have diferents options for the user how can be create a new wetland,register the species for the wetland or register a event who gonna pass in the wetland


package ui;
import java.util.Scanner;
public class Weatland{
    public static Scanner reader;
	public static void main(String[] args) {

		reader = new Scanner(System.in);
        boolean flag=true;
		System.out.println("welcome to the weatland 2000");
        while(flag==true){
        System.out.println("menu:\n1.create weatland\n2.register a new specie\n3.register a new event\n4.exit");
        
            int mainOption = reader.nextInt();
            switch( mainOption){
                case 1:
                    break;

                case 2:
                 break;

                case 3:
                    break;

                case 4:
                 System.out.println("thanks for using wetland 2000 see you later :)");
                 flag=false;
                break;
        
                    }
		
        }
    }

}