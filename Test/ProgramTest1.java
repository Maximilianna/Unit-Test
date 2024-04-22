import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;


public class ProgramTest1 {
	Program p = new Program();
	@Test
	public void test1() {
		p.test1(10, 7);
		assertThat(p.getStr(),startsWith("x=a*a*b"));
	}
	@Test
	public void test2() {
		p.test1(-1, -2);
		assertThat(p.getStr(),startsWith("x=a-b"));
	}
	@Test
	public void test3() {
		p.test1(10, 3);
		assertThat(p.getStr(),startsWith("x=a+b"));
	}
}
