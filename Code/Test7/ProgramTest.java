package Test7;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ProgramTest {
    @Test
    public void test1(){
        Program p = new Program("zxpazjsd","123456");
        assertThat(p.getStr(),containsString("注册成功"));
    }
    @Test
    public void test2(){
        Program p = new Program("zxpazjs","123456");
        assertThat(p.getStr(),containsString("用户名不符合要求"));
    }
    @Test
    public void test3(){
        Program p = new Program("zxpazj4d","123456");
        assertThat(p.getStr(),containsString("用户名不符合要求"));
    }
    @Test
    public void test4(){
        Program p = new Program("zxpazjsd","12346");
        assertThat(p.getStr(),containsString("密码不符合要求"));
    }
    @Test
    public void test5(){
        Program p = new Program("zxpazjsd","1234z56");
        assertThat(p.getStr(),containsString("密码不符合要求"));
    }
}
