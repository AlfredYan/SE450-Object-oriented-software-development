import java.io.*;

import Calculator.CalculatorFactory;
import Calculator.IOperatorStrategy;

/***
 * Strategy Pattern demo (this demo also use static factory pattern)
 * 1. Add an interface for the Strategy
 * 2. Create classes that implement interface
 * 3. Pass in via method parameters or constructor parameters to the class to perform pieces of algorithms
 * 
 * encapsulate the algorithm
 * complete and do part of the algorithm
 * @author KYAN4
 *
 */

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter operations in the form of \"x + y\" (with spaces)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		Calculator calculator = new Calculator();
		
		while(!(input = br.readLine()).toLowerCase().equals("exit")) {
			String[] inputParts = input.split(" ");
			int firstInput = Integer.parseInt(inputParts[0]);
			String operator = inputParts[1];
			int secondInput = Integer.parseInt(inputParts[2]);
			
			int result;
			
			// The following line shows how client code uses a static factory.
			// In this case, we are receiving a strategy object.
			IOperatorStrategy operatorStrategy = CalculatorFactory.getCalculator(operator);
			
			calculator.setFirstNumber(firstInput);
			calculator.setSecondNumber(secondInput);
			result = calculator.calculate(operatorStrategy);
			
			System.out.println(result);
		}
		
	}
}
