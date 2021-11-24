package practice1;

public class Program1 {

static double calculate(double a, double b, String operation) throws Exception {

		double result = 0;

		switch (operation) {
		case "+":
			result = a + b; //addition
			break;
		case "-":
			result = a - b; //subtraction
			break;

		case "*":
			result = a * b; //multiplication
			break;

		case "/":
			result = a / b; //division
			break;

		case "%":
			result = a % b; //modulus
			break;
			
			default: throw new Exception(" unsupported operation");

		}
		return result;
	}

	public static void main(String args[]) throws Exception {

		System.out.println(calculate(1, 2, "-")); //sample input
	}
}
