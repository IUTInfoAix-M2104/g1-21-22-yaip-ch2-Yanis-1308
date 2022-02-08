import java.util.Scanner;
 public class  CircleComputation {   // Save as "SumAverageRunningInt.java"
 
 public static void Cercle() {
	  // Declare variables
      double radius, diameter, circumference, area;  // inputs and results - all in double


      // Prompt and read inputs as "double"
	  Scanner in = new Scanner(System.in); 
      System.out.print("Enter the radius: ");
      radius = in.nextDouble();  // read input as double
		in.close();

      // Compute in "double"
	 circumference = 2.0 * Math.PI * radius;
	 diameter = 2.0 * radius;
     area = Math.PI*radius*radius;

      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
      System.out.printf("radius is: %.2f%n", radius);
     System.out.printf(" diameter is: %.2f%n", diameter);
	 System.out.printf("area is: %.2f%n", area);
	 System.out.printf("circumeferences is: %.2f%n",circumference);
 }
  public static void Sphere() {
	  // Declare variables
      double volume , surfaceArea,radius;  // inputs and results - all in double


      // Prompt and read inputs as "double"
	  Scanner in2 = new Scanner(System.in); 
      System.out.print("Enter the radius: ");
      radius = in2.nextDouble();  // read input as double
		in2.close();

      // Compute in "double"
	surfaceArea = 4 * Math.PI * radius * radius;
	volume = 4 /3 * Math.PI * radius * radius * radius;

      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
      System.out.printf("radius is: %.2f%n", radius);
     System.out.printf(" surfaceArea is: %.2f%n", surfaceArea);
	 System.out.printf("volume is: %.2f%n",volume);

 }
  public static void Cylindre() {
	  // Declare variables
      double baseArea , surfaceArea,radius,volume,height;  // inputs and results - all in double


      // Prompt and read inputs as "double"
	  Scanner in3 = new Scanner(System.in); 
      System.out.print("Enter the radius: ");
      radius = in3.nextDouble();  // read input as double
      System.out.print("Enter the height: ");
      height = in3.nextDouble();  // read input as double
		in3.close();

      // Compute in "double"
		baseArea = Math.PI * radius * radius;
		surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
		volume = baseArea * height;

      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
      System.out.printf("radius is: %.2f%n", radius);
     System.out.printf(" baseArea is: %.2f%n", baseArea);
	 System.out.printf("surfacearea is: %.2f%n",surfaceArea);
	 System.out.printf("volume is: %.2f%n",volume);

 }

   public static void main (String[] args) {
      //Cercle(); 
	  Sphere();
	  //Cylindre();
	 
   }
 }
   