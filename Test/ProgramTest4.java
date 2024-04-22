import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Collection;
import java.util.Arrays;


@RunWith(Parameterized.class)
public class ProgramTest4 {
	Program p = new Program();
	
	private String username = null;
	private String password = null;
	private String expected = null;
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"","","用户名或密码不能为空"},
			{"admin","123","登录成功"},
			{"admi","123","请输入正确的用户名"},
			{"admin","1234","请输入正确的密码"},
			{"admi","1234","请输入正确的用户名和密码"}
		});
	}
	
	public ProgramTest4(String username, String password, String expected) {
		this.username = username;
		this.password = password;
		this.expected = expected;
	}
	
	@Test
	public void test() {
		p.test4(username, password);
		assertEquals(expected,p.getStr());
	}
}
