//CAN NOT RUN

// original code

//public class TextConverter { 
//	String text; 
//	public TextConverter(String text) { 
//		this.text = text; 
//	} 
//	public String convertText(int convertType){ 
//		if(printType == 0) 
//			return text.toUpperCase(); 
//		else if(printType == 1) 
//			return text.toLowerCase(); 
//		else return text; 
//	} 
//}


public class RefactorToStrategyDemo {

}

class TextConverter {
	String text;
	ITextFormatter textFormatter;
	
	public TextConverter(String text, int printType) {
		this.text = text;
		
		// without static factory pattern
//		if(printType == 0) 
//			textFormatter = new UpperCaseFormatterStrategy(); 
//		else if(printType == 1) 
//			textFormatter = new LowerCaseFormatterStrategy();
//		else 
//			textFormatter = new NormalTextFormatterStrategy();
		
		//with static factory pattern
		textFormatter = TextFormatterFactory.getStrategy(printType);
	}
	
	public String convertText() {
		return textFormatter.format(text);
	}
	
}

// static factory pattern
class TextFormatterFactory {
	public static ITextFormatter getStrategy(int printType) {
		ITextFormatter textFormatter;
		
		if(printType == 0)
			textFormatter = new UpperCaseFormatterStrategy();
		else if (printType == 1)
			textFormatter = new LowerCaseFormatterStrategy();
		else
			textFormatter = new NormalTextFormatterStrategy();
		
		return textFormatter;
	}
}

// strategy factory
public interface ITextFormatter {
	String format(String text);
}

public class UpperCaseFormatterStrategy implements ITextFormatter {
	@Override
	public String format(String text) {
		return text.toUpperCase();
	}
}

public class LowerCaseFormatterStrategy implements ITextFormatter {

	@Override
	public String format(String text) {
		return text.toLowerCase();
	}
}

public class NormalTextFormatterStrategy implements ITextFormatter {

	@Override
	public String format(String text) {
		return text;
	}
	
}

