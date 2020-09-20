package cum;


public class PiEstimering {

	public static void main(String[] args) {
		
		
		System.out.println(Pi(100));
		
		
		
				
		
			
		}
	

		public static double Pi (int x) {
			double num_point_circle = 0;
			double num_point_total = 0;
			
			for (int i = 0; i<x;) {
				int min = 0;
				int max = 1;
				double random_double1 = Math.random() * (max - min) + min;
				double random_double2 = Math.random() * (max - min) + min;
				
				
		        
				double a = random_double1;
				double b = random_double2;
				
				double distance = Math.pow(a, 2) + Math.pow(b, 2);
				double distance1 = Math.sqrt(distance);
				if (distance1 <= 1); {
					num_point_circle++;
					
				}
				num_point_total++;
				i++; 
		
		}
			System.out.println(num_point_circle + " " + num_point_total);
			double pi = (4* (num_point_circle/num_point_total));
			return (pi);
			
	}
	
}
