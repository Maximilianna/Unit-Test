import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class ProgramTest2 {
	Program p = new Program();
	@Test
	public void test1() {
		p.test2(1995, 15);
		assertThat(p.getStr(),equalTo("月份输入不正确"));
	}
	@Test
	public void test2() {
		p.test2(1995, 1);
		assertThat(p.getStr(),equalTo("31天"));
	}
	@Test
	public void test3() {
		p.test2(1995, 4);
		assertThat(p.getStr(),equalTo("30天"));
	}
	@Test
	public void test4() {
		p.test2(2004, 2);
		assertThat(p.getStr(),equalTo("2004年2月份的天数是29天"));
	}
	@Test
	public void test5() {
		p.test2(2000, 2);
		assertThat(p.getStr(),equalTo("2000年2月份的天数是29天"));
	}
	@Test
	public void test6() {
		p.test2(1900, 2);
		assertThat(p.getStr(),equalTo("1900年2月份的天数是28天"));
	}
}
