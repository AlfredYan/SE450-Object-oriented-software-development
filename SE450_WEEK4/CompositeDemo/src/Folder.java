import java.util.ArrayList;
import java.util.List;

public class Folder implements IFileSystemItem {
	private String name;
	List<IFileSystemItem> items = new ArrayList<IFileSystemItem>();
	
	public Folder(String name) {
		this.name = name;
	}

	public void add(IFileSystemItem fileSystemItem) {
		items.add(fileSystemItem);
		
	}

	@Override
	public int getSize() {
		int totalSize = 0;
		
		for(IFileSystemItem fileSystemItem : items) {
			totalSize += fileSystemItem.getSize();
		}
		
		return totalSize;
	}

	@Override
	public IFileSystemItem find(String itemName) {
		if(name.equals(itemName))
			return this;
		
		for(IFileSystemItem item : items) {
			IFileSystemItem fileSystemItem = item.find(itemName);
			
			if(fileSystemItem != null) {
				return fileSystemItem;
			}
		}
		
		return null;
	}
	
}
