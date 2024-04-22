import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class ProgramTest3 {
	Program p = new Program();
	@Test
	public void test1() {
		p.test3("abcde@163.com", "123456");
		assertThat(p.getStr(),equalTo("信息正确"));
	}
	@Test
	public void test2() {
		p.test3("abcde@163.com", "12346");
		assertThat(p.getStr(),equalTo("密码不符合要求"));
	}
	@Test
	public void test3() {
		p.test3("abcde@163.com.c", "123456");
		assertThat(p.getStr(),equalTo("邮箱地址不符合要求"));
	}
}
