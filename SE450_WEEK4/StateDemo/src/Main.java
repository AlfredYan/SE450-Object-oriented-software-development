/***
 * State Pattern
 * 1. Create an interface along with methods for the state's behavior.
 * 2. Create classes(states) that implement the interface.
 * 3. The client class will have a private state(the interface), that it will manage internally.
 * 
 * Encapsulate certain functionalities into classes.
 * A client class(in this case is Se450Date) will switch different states.
 * 
 * @author kaichengyan
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Se450Date date = new Se450Date();
		
		for(int i=0; i<7; i++) {
			
			date.printDayOfWeek();
			date.printDate();
			date.doIHaveWorkToday();
			date.soundAlarm();
			
			System.out.println();
			date.addDate();
		}
	}
}
