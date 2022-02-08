/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
import java.util.Scanner;
 public class Add2Integers {   // Save as "SumAverageRunningInt.java"
 
 public static void Add() {
	 // Declare variables
      int number1, number2, sum;

      // Put up prompting messages and read inputs as "int"
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      System.out.print("Enter first integer: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "int"
	  System.out.print("Enter second integer: ");  // No newline for prompting message
      number2 = in.nextInt();                     // Read next input as "int"
      in.close();  // Close Scanner

      // Compute sum
      sum = number1 + number2;

      // Display result
      System.out.println("The sum is: " + sum);   // Print with newline
 }

   public static void main (String[] args) {
      Add();
	 
   }
 }
   