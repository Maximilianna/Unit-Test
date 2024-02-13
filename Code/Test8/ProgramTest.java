package Test8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1(){
        Program p = new Program("abcdefg");
        assertEquals("替换前缀后的字符串为：efcdefg",p.getStr());
    }
    @Test
    public void test2(){
        Program p = new Program("cdbccd");
        assertEquals("替换后缀后的字符串为：ghbcgh",p.getStr());
    }
    @Test
    public void test3(){
        Program p = new Program("bcbcbcbc");
        assertEquals("大写字母的字符串为：BCBCBCBC",p.getStr());
    }
}
