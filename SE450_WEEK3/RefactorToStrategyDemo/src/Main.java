import java.io.*;

/***
 * Refactor to strategy demo
 * @author KYAN4
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text to convert");
		String text = br.readLine();
		System.out.println("Enter type of conversion");
		String type;
		
		while(!((type = br.readLine()).toLowerCase().equals("exit"))) {
			
			ITextFormatter formatter;
			
			// origin code (without strategy, expose the algorithm and has "code smell")
//			switch(type.toLowerCase()) {
//				case "lowercase":
//					System.out.println(text.toLowerCase());
//					break;
//				case "uppercase":
//					System.out.println(text.toUpperCase());
//					break;
//				default:
//					throw new Exception();
//			}
			
			// refactor to strategy (encapsulate the algorithm)
			switch(type.toLowerCase()) {
				case "lowercase":
					formatter = new LowerCaseStrategy();
					break;
				case "uppercase":
					formatter = new UpperCaseStrategy();
					break;
				case "togglecase":
					formatter = new ToggleCaseStrategy();
					break;
				default: 
					throw new Exception();
			}
			
			System.out.println(formatter.formatText(text));
		}
	}
}
