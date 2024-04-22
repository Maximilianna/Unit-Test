import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class ProgramTest11 {
	Program p = new Program();
	@Test
	public void test1() {
		p.test11("zxp", "15142113182", "a11bcd");
		assertThat(p.getStr(),equalTo("OK"));
	}
	@Test
	public void test2() {
		p.test11("zxp", "1514213182", "a11bcd");
		assertThat(p.getStr(),equalTo("手机号不符合要求"));
	}
	@Test
	public void test3() {
		p.test11("zxp", "15142113182", "211bcd");
		assertThat(p.getStr(),equalTo("地址不符合要求"));
	}
}
