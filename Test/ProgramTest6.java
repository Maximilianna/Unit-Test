import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ProgramTest6 {
	Program p = new Program();
	@Test
	public void test1() {
		p.test6('M', 'o');
		assertEquals("Monday",p.getStr());
	}
	@Test
	public void test2() {
		p.test6('T', 'u');
		assertEquals("Tuesday",p.getStr());
	}
	@Test
	public void test3() {
		p.test6('W', 'e');
		assertEquals("Wednesday",p.getStr());
	}
	@Test
	public void test4() {
		p.test6('T', 'h');
		assertEquals("Thursday",p.getStr());
	}
	@Test
	public void test5() {
		p.test6('F', 'r');
		assertEquals("Friday",p.getStr());
	}
	@Test
	public void test6() {
		p.test6('S', 'a');
		assertEquals("Saturday",p.getStr());
	}
	@Test
	public void test7() {
		p.test6('S', 'u');
		assertEquals("Sunday",p.getStr());
	}
}
