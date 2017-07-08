/***
 * Composite pattern
 * An object that's made up of multiple objects, which may in turn be made up of multiple objects
 * 
 * 1. Create an interface
 * 2. Create one or more leaf classes that implement that interface
 * 3. Create one or more composite classes that implement the interface.
 *    The composite class must has a reference to a single object or a list of objects or a list
 *    of objects that reference the interface.
 * 
 * The client does't know the structure of the composite object, it acts as one single object.
 *     
 * @author kaichengyan
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		IFileSystemItem fileSystemItem = FileSystemFactory.getFileSystem();
		int result = fileSystemItem.getSize();
		System.out.println(result);
	}

}
