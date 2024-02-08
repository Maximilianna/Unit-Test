package Test4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(Parameterized.class)
public class ProgramTest {
    private String str;
    private String username;
    private String password;

    @Parameterized.Parameters
    public static Collection userData(){
        return Arrays.asList(new Object[][]{
                {"用户量和密码不能为空","",""},
                {"登录成功","admin","123"},
                {"请输入正确的用户名","add","123"},
                {"请输入正确的密码","admin","1234"},
                {"请输入正确的用户名和密码","add","1234"}
        });
    }

    public ProgramTest(String str,String username,String password){
        this.str = str;
        this.username = username;
        this.password = password;
    }

    @Test
    public void test(){
        Program p = new Program(username,password);
        assertThat(p.getStr(),equalTo(str));
    }
}
