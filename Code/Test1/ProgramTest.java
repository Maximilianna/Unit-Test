package Test1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class ProgramTest {
    @Test
    public void test1() {
        Program p = new Program(10, 6);
        assertThat(p.getX(), equalTo(600));
    }

    @Test
    public void test2() {
        Program p = new Program(-1, -2);
        assertThat(p.getX(), equalTo(1));
    }

    @Test
    public void test3() {
        Program p = new Program(-1, 5);
        assertThat(p.getX(), equalTo(4));
    }
}
