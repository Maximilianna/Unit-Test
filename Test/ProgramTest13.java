import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ProgramTest13 {
	Program p = new Program();
	@Test
	public void test1() {
		p.test13(12, -1, 0);
		assertEquals("输入边值不在范围内",p.getStr());
	}
	@Test
	public void test2() {
		p.test13(2, 1, 1);
		assertEquals("输入边值不能组成三角形",p.getStr());
	}
	@Test
	public void test3() {
		p.test13(2, 3, 3);
		assertEquals("能组成等腰三角形",p.getStr());
	}
	@Test
	public void test4() {
		p.test13(5, 5, 5);
		assertEquals("能组成等边三角形",p.getStr());
	}
	@Test
	public void test5() {
		p.test13(2, 3, 4);
		assertEquals("能组成普通三角形",p.getStr());
	}
}
