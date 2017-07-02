package Calculator;

// static class
// this is a Static Factory class - it CREATES strategy objects
public class CalculatorFactory {
	public static IOperatorStrategy getCalculator(String operator) throws Exception {
		IOperatorStrategy strategy;
		
		switch(operator) {
			case "+":
				strategy = new AdditionStrategy();
				break;
			case "-":
				strategy = new SubtractionStrategy();
				break;
			case "*":
				strategy = new MultiplicationStrategy();
				break;
			default: 
				throw new Exception();
		}
		
		return strategy;
	}
}
