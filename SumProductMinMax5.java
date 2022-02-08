import java.util.Scanner;
 public class SumProductMinMax5 {   // Save as "SumAverageRunningInt.java"
 
 public static void toto() {
	 // Déclare les variables 
      int number1,number2,number3,number4,number5 ;  // Les 3 entiers d'entrée 
      int sum, product, min, max;     // Pour calculer ces 
	  
      // Invitez et lisez les entrées comme "int" 
      Scanner in = new Scanner(System.in);  // Scanne le clavier 
      System.out.print("Entrer le premiére entier: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "int"
	  System.out.print("Entrer le deuxieme entier: ");  // No newline for prompting message
      number2 = in.nextInt();                     // Read next input as "int"
	  System.out.print("Entrer le troisieme entier: ");  // No newline for prompting message
      number3 = in.nextInt();                     // Read next input as "int"
	  System.out.print("Entrer le quatrieme entier: ");  // No newline for prompting message
      number4 = in.nextInt();                     // Read next input as "int"
	  System.out.print("Entrer le cinquieme entier: ");  // No newline for prompting message
      number5 = in.nextInt();                     // Read next input as "int"
      
	  in.close();
	  
      // Compute sum and product
      sum = number1 + number2 + number3 + number4 + number5;
      product = number1 * number2 * number3 * number4 * number5;

      // Compute min
      // The "coding pattern" for computing min is:
      // 1. Set min to the first item
      // 2. Compare current min with the second item and update min if second item is smaller
      // 3. Repeat for the next item
      min = number1;        // Assume min is the 1st item
      if (number2 < min) {  // Check if the 2nd item is smaller than current min
         min = number2;     // Update min if so
      }
      if (number3 < min) {  // Continue for the next item
         min = number3;
      }
	    if (number4 < min) {  // Continue for the next item
         min = number3;
      }
	    if (number5 < min) {  // Continue for the next item
         min = number3;
      }
      
      // Compute max - similar to min
       max = number1;        // Assume min is the 1st item
      if (number2 > max) {  // Check if the 2nd item is smaller than current min
         max = number2;     // Update min if so
      }
      if (number3 > max) {  // Continue for the next item
         max = number3;
      }
	    if (number4 > max) {  // Continue for the next item
         max = number4;
      }
	    if (number5 > max) {  // Continue for the next item
         max = number5;
      }
      
      
      // Print results
      System.out.println("The sum is: " + sum);   // Print with newline
	  System.out.println("The product is: " + product);   // Print with newline
	   System.out.println("The min is: " + min);   // Print with newline
	   System.out.println("The max is: " + max);   // Print with newline
	 
 }

   public static void main (String[] args) {
      toto();
	 
   }
 }
   