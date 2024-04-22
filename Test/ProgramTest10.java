import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class ProgramTest10 {
	Program p = new Program();
	@Test
	public void test1() {
		p.test10(80, 60);
		assertThat(p.getStr(),equalTo("a=x:2"));
	}
	
	@Test
	public void test2() {
		p.test10(70, 60);
		assertThat(p.getStr(),equalTo("a=x:3"));
	}
	
	@Test
	public void test3() {
		p.test10(75, 80);
		assertThat(p.getStr(),equalTo("a=x:4"));
	}
}
