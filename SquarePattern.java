import java.util.Scanner;
 public class SquarePattern {   // Save as "SumAverageRunningInt.java"
 
 public static void swap() {
	 // Déclare les variables 
      int number1,number2,swap; // Les 3 entiers d'entrée 
	  
      // Invitez et lisez les entrées comme "int" 
      Scanner in = new Scanner(System.in);  // Scanne le clavier 
      System.out.print("Entrer le premier entier: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "int"
	  System.out.print("Entrer le deuxieme entier: ");  // No newline for prompting message
      number2 = in.nextInt();   
	  in.close();
	  
	  swap = number1;
	  number1 = number2;
	  number2 = swap;
	  
	  System.out.printf("number1 is: %.2f%n",number1);
	  System.out.printf("number2 is: %.2f%n",number2);
 }
 

   public static void main (String[] args) {
	swap();
	
	 
   }
 }