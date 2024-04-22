import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ProgramTest14 {
	Program p = new Program();
	@Test
	public void test1() {
		assertEquals(2,p.test14(1, 0));
	}
	@Test
	public void test2() {
		assertEquals(0,p.test14(0, 0));
	}
	@Test
	public void test3() {
		assertEquals(10,p.test14(1, 1));
	}
	@Test
	public void test4() {
		assertEquals(20,p.test14(1, 2));
	}
}
