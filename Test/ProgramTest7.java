import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class ProgramTest7 {
	Program p = new Program();
	@Test
	public void test1() {
		p.test7("abcdefgh", "123456");
		assertThat(p.getStr(),containsString("成功"));
	}
	@Test
	public void test2() {
		p.test7("abcdefgh", "12456");
		assertThat(p.getStr(),containsString("密码"));
	}
	@Test
	public void test3() {
		p.test7("abcddefgh", "123456");
		assertThat(p.getStr(),containsString("用户名"));
	}
}
