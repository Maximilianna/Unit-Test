package Test2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProgramTest {
    @Test
    public void test1(){
        Program p = new Program(2024,1);
        assertThat(p.getDays(),equalTo(31));
    }
    @Test
    public void test2(){
        Program p = new Program(2024,4);
        assertThat(p.getDays(),equalTo(30));
    }
    @Test
    public void test3(){
        Program p = new Program(2000,2);
        assertThat(p.getDays(),equalTo(28));
    }
    @Test
    public void test4(){
        Program p = new Program(2024,2);
        assertThat(p.getDays(),equalTo(29));
    }
}
