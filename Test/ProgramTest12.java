import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;;


public class ProgramTest12 {
	Program p = new Program();
	@Test
	public void test1() {
		p.test12(70, 30);
		assertThat(p.getStr(),startsWith("j1"));
	}
	@Test
	public void test2() {
		p.test12(25, 30);
		assertThat(p.getStr(),startsWith("j2"));
	}
	@Test
	public void test3() {
		p.test12(25, 70);
		assertThat(p.getStr(),startsWith("j3"));
	}
}
