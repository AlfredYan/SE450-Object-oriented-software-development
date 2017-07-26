import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/***
 * Observer Pattern
 * 1. Create interface for the subject(what is being observed) and observer(what is being notified)
 * 2. create the concrete classes that implement the interface
 * 
 * ISubject: registerObserver(), notifyObservers()
 * IObserver: update()
 * 
 * In client code, an observer will register itself via registerObserver(),
 * when the event occurs, the subject will call notifyObservers(), 
 * which will iterate over its list of observers and call update() on each.
 * 
 * @author kaichengyan
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		IKeyboardCommandHandler keyboardCommandHandler = new keyboardCommandHandler();
		ISpacebarHandler spacebarHandler = new SpacebarHandler();
		List<Character> characters = new ArrayList<Character>();
		Character removeCharacter = null;
		
		keyboardCommandHandler.registerObserver(spacebarHandler);
		
		for(int i=0; i<10; i++) {
			Character c = new Character(i);
			characters.add(c);
			
			if(i % 2 == 0) {
				spacebarHandler.registerObserver(c);
			}
			
			if(i == 4) {
				removeCharacter = c;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while (!(input = br.readLine()).toLowerCase().equals("exit")) {
			keyboardCommandHandler.readInput(input);
			
			if(input.equals("r"))
				spacebarHandler.deregisterObserver(removeCharacter);
		}
	}
}
