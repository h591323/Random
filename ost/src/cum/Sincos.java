package cum;

public class Sincos {

	public static void main(String[] args) {
		
		 System.out.println("x i grader  x i radianer    sin(x)    cos(x)");
		 System.out.println("---------------------------------------------------");
		 
		for (double i = 0; i<=180;) {
			 
			double j = (Math.PI*i)/180;
			
			if( i < 10) { System.out.print(" ");}
			if( i < 100) { System.out.print(" ");}
			
			 System.out.print("   " + Desimaler(i, 3) + "         " + Desimaler(j, 3) + "           " + Desimaler(Math.sin(j), 3) + "       " + Desimaler(Math.cos(j), 3));
			 
			 System.out.println();
			 
			 
			 i = i + 15;
		 }
		
		
		 System.out.println("---------------------------------------------------");
			
			
		
		

	}
	
	private static double Desimaler(double num, int decimalCount) {
	    return (int)(Math.pow(10, decimalCount) * num + 0.5)/Math.pow(10, decimalCount);
	}
	
}
