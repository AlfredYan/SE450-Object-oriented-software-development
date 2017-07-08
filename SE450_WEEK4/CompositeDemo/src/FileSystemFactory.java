// file system structure
//	Root
//	| - Folder 1
//	|   | - Folder 2
//	|	|	| - File 1
//	|	| - File 2
//	| - File 3

public class FileSystemFactory {
	
	public static IFileSystemItem getFileSystem() throws Exception {
		
		// use builder pattern
		FileSystemBuilder builder = new FileSystemBuilder("root");
		
		builder.addFolderToParent("root", "folder1");
		builder.addFileToParent("root", 56, "file3");
		
		builder.addFolderToParent("folder1", "folder2");
		builder.addFileToParent("folder1", 63, "file3");
		
		builder.addFileToParent("folder2", 45, "file1");
		
		IFileSystemItem fileSystem = builder.getFileSystem();
		
		return fileSystem;
		
		// Without using builder pattern
		
//		File file1 = new File(45, "File1");
//		Folder folder2 = new Folder("Folder2");
//		folder2.add(file1);
//
//		File file2 = new File(63, "File2");
//		Folder folder1 = new Folder("Folder1");
//		folder1.add(file2);
//		folder1.add(folder2);
//		
//		File file3 = new File(56, "File3");
//		
//		Folder root = new Folder("Root");
//		root.add(file3);
//		root.add(folder1);
//		
//		return root;
	}
}
