package practice1;

public class program2 {
	
	static void generateSeries(int x) {
		if(x<=0) {
			System.out.println("Please enter a positive number");
		}
		
		else {
			
			for(int i=1;i<=2*x-1;i+=2) {
				System.out.print(i);
				
				if(i+2<=2*x-1) {
					System.out.print(","+" ");
				}
			}
		}
	}
		
	public static void main(String args[]) {
		generateSeries(3);
		
	}
}
