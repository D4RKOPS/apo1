package ui;
 //descripcion: we need to create a turling machine who is the base of the modern computacion, this machine  have a tape who is the part who gonna add the values and a state who is the part who gonna show the posicion in the tape, this tape can generate the values automatically  or manual asking to the user,the machine can move to the left and right and change her state constantly
 /*example:a user wants to use the turling machine so he start the program and select the option to fill the tape manual, 
 the program ask them the tape size, the user write that the tape is gona be for 4 values, the system ask them the values 
 who gonna fill the tape 4 times and ask them the letter for the state, later of this the system gonna print the tape and the state
 to show to the user how is the result of the tape, and ask that if the user wants to finish the program or continue editing the values for the tape,the user chose continue and the system ask them how wnat to edit the tape so the user write 1bl(the first value represents the number in the size,the second value represent the state ,the third value represents the movement of the tape, left,right)the system show the tape with the modifications and ask agian if the user wants to continue or finish, the user chose the options of finish and the program show a menage of good bye to the user
 */
 import java.util.Random;
    import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.Arrays;

 	
 
 // "#" is the default blank
//
// "R" for moving the head to the right
//
// "L" for moving the head to the left




public class Turling{
    public static int fillOptions=0;
	public static int countersize;
	public static String [] tape;
	public static int whilecondition=0;
	public static String state;
	public static String [] machineState;

	public static String stateQuestion;
	public static String stateTape;
	public static String [] horizontal;
	public static int middle;
	public static String [] tapeRandom;

	public static String caracterstate;
	public static String machine;
	public static int indexstate;

	//decription: this metod start the array state for show to the user 
	//preondicion:value countersize and the array state
	//postcondicion:the value indexstate gonna contain the middle of the tape
	//@param int countesize, @param array state @param int indexstate
		public static void initializerState(){

			indexstate=Math.round(countersize/2);
			 
			
		}
		/*  
		para mover la maquina necesitamos de un substring el cual se va a comparar con la instruccion que ingrese el usuario siendo l izquierda por lo que a la posicion se le resta 1 y r derecha por lo que a la posicion se le suma 1
		*/

		//description: this method is used for generate the positon of the state(in the middle)
		//precondition:this method need that the value state had been initialized 
		//postcondition:this metod gonna print the state in the middle of the tape
		//@param int spacestate,@param string spaces,@param indexstate
		public static void stateGenerator(){

			int spaceState=(((indexstate+1)*3)-3);
			String spaces="";
			

			
			
			for (int a=0;a<spaceState;a++){
				spaces+=" ";
			
				
				

			}	
			System.out.println(spaces+"|"+state+"|");
				System.out.println(spaces+" v");

		}
	

		/*description:this metod generate the aleatory values for the tape(numbers, and the state)
		preconditio:this method need the values from countersize
		postconditon:this method dont gonna change the values of the array machinestate, and state
		@param char ramdomstate,@param randomnumber,@param numberRandomstring
		
		
		
		*/ 
		 public static void randomvalues (){
			
			Random rd= new Random();
			
			char randomState = (char) (rd.nextInt(26) + 'A');
			machineState= new String[countersize];
        	state = String.valueOf(randomState);
			indexstate=Math.round(countersize/2);
       		   
				for (int i=0;i<countersize;i++){
					int randomNumber= rd.nextInt(2);
					String numberRandomstring= randomNumber+"";
					tape[i]=numberRandomstring;
				}
			}

   
				
				
		//}	

	    
		////decription: this metod start the array tape for sgenerate all the program 
		//preondicion:value countersize,and array tape
		//postcondicion:change the size of the tape
		 
		public static void initiatorsize(){

			tape = new String [countersize];
   
	   	}

		   //description: in this metod we found all the importants aspects for the code how are the questions or the print of the size
		public static void main(String[] args) {
		 Scanner lector = new Scanner(System.in);
	     
		 
		 System.out.println ("welcome to the turling machine");
		 
		 while(whilecondition!=1){
		 System.out.println ("menu");
		 System.out.println ("1.start\n2.show the tape\n3.exit");
         int firstquestion=lector.nextInt();
		 
		 
	    	while(firstquestion!=1 && firstquestion!=2 && firstquestion!=3){

			System.out.println("the number supplied is different from the options shown, enter the number again");
			 firstquestion=lector.nextInt();

			}
		 
	     
		 switch (firstquestion) {
			 case 1:
			 System.out.println("enter the size of the tape");
			 
			  countersize= lector.nextInt();

			  	while(countersize==1){

					System.out.println("the number supplied cant generate a tape because is very little,please enter the number again");
					countersize= lector.nextInt();

	
				}
			  initiatorsize();
			 

			 
			 System.out.println ("how do you want to fill the size?\n1.automatic\n2.manual");
			  fillOptions=lector.nextInt();
			  while(fillOptions!=1 && fillOptions!=2){

				System.out.println("the number supplied is different from the options shown, enter the number again");
				 firstquestion=lector.nextInt();
	
				}
				  


			 switch(fillOptions){
				case 1:
				randomvalues();
					
					
					stateGenerator();
					
					System.out.println(Arrays.toString(tape).replaceAll(",","|"));
					
				 break;


				case 2:
				System.out.println("please introduce the state of the tape(can be anithing letter)");
					String stateTape=lector.next();
				for(int i=0;i<countersize;i++){
				System.out.println("enter the value for the tape");
				String valuesTape=lector.next();
				state=stateTape;
				
				tape[i]=valuesTape;}
				

					initializerState();
					stateGenerator();
					

					System.out.println(Arrays.toString(tape).replaceAll(",","|"));
					
				}
						
							   

		    System.out.println("do you want to continue?\n1.yes\n2.no");
			int continueQuestion=lector.nextInt();
			while(continueQuestion!=1 && continueQuestion!=2){

				System.out.println("the number supplied is different from the options showeds, enter the number again");
				 continueQuestion=lector.nextInt();
	
				}

			
				
				
				switch ( continueQuestion){
					case 1:
					System.out.println("enter the changes that you want to aply to the tape\nthe first value taht you write is the nomber inside the tape,the second number is from the new state that you want in the tape,and the third is for to what directions do you want to move the tape(l is for left and R is for right)");
					String positionvalue=lector.next();

					System.out.println("do you want to keep changing the tape?\n1.yes\n2.no");
					int questionchanges=lector.nextInt();
					

					switch(questionchanges){
						case 1:
						break;

						case 2:
						break;
					}

					break;
	


					

					

					case 2:
					
						//this is for show the menu again
					break;

				}


				break;

				case 2:
				initializerState();
				stateGenerator();
				
				System.out.println(Arrays.toString(tape).replaceAll(",","|"));
				break;


			  case 3:
				System.out.println("thanks for using the turling machin, see you later");
				whilecondition=1;
				break;
			
			}
		 	
		 	
		}
		 
		
		
		    
		
		
		
		/*System.out.println("for what direction do you want to move the size?\n1.left(L)\n2.right(R)");
		int direction=lector.nextInt();
		*/
	   
	 
	 
	}
	 
	 
	 
}