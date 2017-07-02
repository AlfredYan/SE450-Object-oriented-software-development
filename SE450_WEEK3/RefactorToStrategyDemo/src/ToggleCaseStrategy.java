
public class ToggleCaseStrategy implements ITextFormatter {

	@Override
	public String formatText(String input) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		boolean upperCase = true;
		
		for(char c: input.toCharArray()){
			if(upperCase){
				sb.append(Character.toUpperCase(c));
			}else {
				sb.append(Character.toLowerCase(c));
			}
			
			upperCase = !upperCase;
		}
		
		return sb.toString();
	}

}
