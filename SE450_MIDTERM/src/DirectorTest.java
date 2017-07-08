import static org.junit.Assert.*;

import org.junit.Test;

class VideoObj {
	private String title;
	private int year;
	private String director;
	public VideoObj(String title, int year, String director) {
		this.title = title;
		this.year = year;
		if(director == null || director.trim().equals(""))
			throw new IllegalArgumentException("Director");
		this.director = director;
		
	}
	
	public String getDirector() {
		return director;
	}
}

public class DirectorTest {
	
	@Test
	public void testDirectorIsEmptyStringShouldThrowIllegalArgumentException() {
		try {
			VideoObj obj = new VideoObj("", 1234, "");
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("Director", ex.getMessage());
		}
	}
	
	@Test
	public void testDirectorIsNullShouldThrowIllegalArgumentException() {
		try {
			VideoObj obj = new VideoObj("", 1234, null);
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("Director", ex.getMessage());
		}
	}
	
	@Test
	public void testDirectorIsSpaceShouldThrowIllegalArgumentException() {
		try {
			VideoObj obj = new VideoObj("", 1234, "           \t");
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("Director", ex.getMessage());
		}
	}
	
	@Test
	public void testDirectorSetVaildValue() {
		VideoObj obj = new VideoObj("", 1234, "Yan");
		assertEquals("Yan", obj.getDirector());
	}
	
}
