
public class FileSystemBuilder {
	private Folder rootFolder;
	
	public FileSystemBuilder(String rootName) {
		rootFolder = new Folder(rootName);
	}
	
	public IFileSystemItem getFileSystem() {
		return rootFolder;
	}

	public void addFolderToParent(String parentName, String folderName) throws Exception {
		Folder newFolder = new Folder(folderName);
		addFileSystemItemToParent(newFolder, parentName);
	}

	public void addFileToParent(String parentName, int fileSize, String fileName) throws Exception {
		File newFile = new File(fileSize, fileName);
		addFileSystemItemToParent(newFile, parentName);
	}
	
	public void addFileSystemItemToParent(IFileSystemItem fileSystemItem, String parentName) 
			throws Exception {
		IFileSystemItem parentFolder = rootFolder.find(parentName);
		
		if(!(parentFolder instanceof Folder) || parentFolder == null) {
			throw new Exception();
		}
		
		((Folder)parentFolder).add(fileSystemItem);
	}
}
