/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
 public class Product1ToN {   // Save as "SumAverageRunningInt.java"
 
 public static void produit() {
	  // Define variables
	 // Define variables
      int product = 1;      // The accumulated product, init to 1
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 11;
	  int number = LOWERBOUND;
	   do {
		   product*=number;
         ++number;                     // update
      } while (number <= UPPERBOUND);  // test
	  System.out.println(product);

     
	 
 }
 

   public static void main (String[] args) {
     produit();
	 
   }
 }
   