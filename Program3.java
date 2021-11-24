package practice1;

public class Program3 {

	static void generateSeries(int x) {
		if(x<=0) {
			System.out.println("Please enter a positive number");
		}
		
		else {
			if(x%2==0) { //we are decrementing x by 1 when x is even number
				x=x-1;
			}
			
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
