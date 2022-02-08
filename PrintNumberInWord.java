/**
 * Trying nested-if and switch-case statements.
 */
public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 8;  // Set the value of "number" here!
 /////////////////////////////////////////////////////////////////////////// Premiere maniére
      // Using nested-if
     // if (number == 1) {   // Use == for comparison
       //  System.out.println( "One");
      //} 
	  //else if (number == 2) {
        // System.out.println( "two");
        //} 
		//else if ( number == 3 ) {
		 //System.out.println( "three");
      //} 
	  //else if (number == 4) {
        // System.out.println( "four");
      //}
	  //////////////////////////////////////////////////////////////////////////////// deuxieme maniere
	   switch(number) {
         case 1: 
            System.out.println( "one" ); break;  // Don't forget the "break" after each case!
         case 2: 
            System.out.println( "two" ); break;
         case 8:
		   System.out.println( "eight" ); break;
         default: System.out.println("bye bye"); 
      }
  	  
   }
}