/***
 * Proxy Pattern (can not compile)
 * 
 * Add functionality to already existing functionality/class.
 * 
 * 
 * @author kaichengyan
 *
 */
public class ProxyDemo1 {
	public static void main(String[] args) {
		String fileName = "";
		CachedFileInfoProxy fileInfoProxy = new CachedFileInfoProxy(fileName);
	}
}

interface IFileInfo {
	int getSize();
	String getAuthor();
}

class FileInfo implements IFileInfo {
	String fileName;
	
	public FileInfo(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public int getSize() {
		File file = openFile(fileName);
		return file.getSize();
	}

	@Override
	public String getAuthor() {
		File file = openFile(fileName);
		return file.getAuthor();
	}
	
}

// Proxy Pattern
class CachedFileInfoProxy implements IFileInfo {

	// know the specific type it will receive.
	FileInfo fileInfo;
	
	int fileSize = -1;
	String fileAuthor;
	
	public CachedFileInfoProxy(String fileName) {
		fileInfo = new FileInfo(fileName);
	}
	
	@Override
	public int getSize() {
		if(fileSize < 0)
			fileSize = fileInfo.getSize();
		return fileSize;
	}

	@Override
	public String getAuthor() {
		if(fileAuthor == null)
			fileAuthor = fileInfo.getAuthor();
		return fileAuthor;
	}
	
}