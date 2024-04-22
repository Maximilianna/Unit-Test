import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class ProgramTest9 {
	Program p = new Program();
	@Test
	public void test1() {
		p.test9(10);
		assertThat(p.getStr(),is("总提成：1.0万"));
	}
	@Test
	public void test2() {
		p.test9(20);
		assertThat(p.getStr(),is("总提成：1.5万"));
	}
	@Test
	public void test3() {
		p.test9(40);
		assertThat(p.getStr(),is("总提成：2.0万"));
	}
	@Test
	public void test4() {
		p.test9(60);
		assertThat(p.getStr(),is("总提成：1.8万"));
	}
	@Test
	public void test5() {
		p.test9(100);
		assertThat(p.getStr(),is("总提成：1.5万"));
	}
	@Test
	public void test6() {
		p.test9(200);
		assertThat(p.getStr(),is("总提成：2.0万"));
	}
}
