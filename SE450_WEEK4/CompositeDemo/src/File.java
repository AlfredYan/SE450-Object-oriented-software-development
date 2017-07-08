
public class File implements IFileSystemItem {
	private String name;
	private int size;
	
	public File(int size, String name) {
		this.name = name;
		this.size = size;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public IFileSystemItem find(String itemName) {
		if(name.equals(itemName))
			return this;
		
		return null;
	}
}
