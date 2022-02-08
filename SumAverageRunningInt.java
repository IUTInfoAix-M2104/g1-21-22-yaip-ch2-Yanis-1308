/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
 public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
 
 public static void Moyenne() {
	  // Define variables
	   int sumodd = 0;	   // The accumulated sum, init to 0
       int sumEven = 0;
	   int absDiff; 
	  double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      // Use a for-loop to sum from lowerbound to upperbound
	  
	  //////////méthode 2 do while
            // declare and init loop index variable
      //do {
        // sum += number;
         //++number;                     // update
      //} while (number <= UPPERBOUND);  // test
	  
	  ////////// méthode 3 avec le count
	    // Compute sums
      for (int number = ...; ...; ...) {
         if (number % 2 != 0) {
            sumOdd += number;
         } else {
            sumEven += number;
         }
      }
      // Compute Absolute Difference
      if (sumOdd > sumEven) {
         absDiff = ......;
      } else {
         absDiff = ......;
      }
      // OR use one liner conditional expression
      absDiff = (sumOdd > sumEven) ? ...... : ......;
      
      // Compute average in double. Beware that int / int produces int!
     average = (double) sum / (double)(count );
      // Print sum and average
	  System.out.println(sum);
      System.out.println("la Moyenne " + "=" + ""+ average);
     
	 
 }
 
 
 
 
 

   public static void main (String[] args) {
     Moyenne();
	 
   }
 }
   