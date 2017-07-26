
public class Character implements ISpacebarObserver {

	private final int id;
	
	public Character(int id) {
		this.id = id;
	}
	
	@Override
	public void update() {
		System.out.println("Character " + id + " jumped!");
	}

}
