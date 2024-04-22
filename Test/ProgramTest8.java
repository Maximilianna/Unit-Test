import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Collection;
import java.util.Arrays;


@RunWith(Parameterized.class)
public class ProgramTest8 {
	String str = null;
	String expected = null;
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"abcde","替换前缀后的字符串为：efcde"},
			{"bbccd","替换cd后的字符串为：bbcgh"},
			{"bbccdd","大写字母的字符串为：BBCCDD"}
		});
	}
	
	public ProgramTest8(String str, String expected) {
		this.str = str;
		this.expected = expected;
	}
	
	@Test
	public void test() {
		Program p = new Program();
		p.test8(str);
		assertEquals(expected,p.getStr());
	}
}
