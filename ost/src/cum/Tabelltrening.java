package cum;

public class Tabelltrening {

	public static void main(String[] args) {
		
		int x = 15;
		double y = (Math.PI*x)/180;
		double z = Math.sin(y);
		double a = Math.cos(y);
		
		
		
		System.out.println(Desimaler(z,2));
		System.out.println(Desimaler(a,2));
		
		System.out.println("  x i grader  x i radianer    sin(x)    cos(x)");
		
		skrivUt();
		

	}
	
	private static int [][] tabell = {
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			
		
	};
	
	
		public static void skrivUt () {
			
			System.out.println("------------------------");
			
			for (int[] rad : tabell){
				for (int v : rad) {
					System.out.print(v + " ");
				}
				System.out.println();
			}
			System.out.print("------------------------");
			
		}
		private static double Desimaler(double num, int decimalCount) {
		    return (int)(Math.pow(10, decimalCount) * num + 0.5)/Math.pow(10, decimalCount);
		}
}
