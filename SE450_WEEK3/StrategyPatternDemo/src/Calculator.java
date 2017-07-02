import Calculator.IOperatorStrategy;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	
	public void setFirstNumber(int i) {
		firstNumber = i;
	}
	
	public void setSecondNumber(int i) {
		secondNumber = i;
	}
	
	//This is how client code utilizes the strategy pattern
	public int calculate(IOperatorStrategy strategy) {
		return strategy.calculate(firstNumber, secondNumber);
	}
}
