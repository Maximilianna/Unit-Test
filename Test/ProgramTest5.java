import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ProgramTest5 {
	Program p = new Program();
	@Test
	public void test1() {
		p.test5(0, 0);
		assertEquals("输入不符合要求",p.getStr());
	}
	@Test
	public void test2() {
		p.test5(4, 4);
		assertEquals("可以构建圆形或正方形",p.getStr());
	}
	@Test
	public void test3() {
		p.test5(5, 2);
		assertEquals("可以构建椭圆",p.getStr());
	}
	@Test
	public void test4() {
		p.test5(10, 2);
		assertEquals("可以构建矩形",p.getStr());
	}
	@Test
	public void test5() {
		p.test5(5, 4);
		assertEquals("可以构建长方形",p.getStr());
	}
}
