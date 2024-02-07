package Test3;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ProgramTest {
    @Test
    public void test1(){
        Program p = new Program("zxpaz@126.com","123456");
        assertThat(p.getStr(),equalTo("信息正确"));
    }
    @Test
    public void test2(){
        Program p = new Program("zxpa@126.com","123456");
        assertThat(p.getStr(),equalTo("邮箱地址不符合要求"));
    }
    @Test
    public void test3(){
        Program p = new Program("zxpaz@126.com","12356");
        assertThat(p.getStr(),equalTo("密码不符合要求"));
    }
}
