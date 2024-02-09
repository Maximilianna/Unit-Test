package Test5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1(){
        Program p = new Program(0,0);
        assertEquals("输入不符合要求",p.getStr());
    }
    @Test
    public void test2(){
        Program p = new Program(5,5);
        assertEquals("可以构建圆形或正方形",p.getStr());
    }
    @Test
    public void test3(){
        Program p = new Program(4,7);
        assertEquals("可以构建椭圆",p.getStr());
    }
    @Test
    public void test4(){
        Program p = new Program(3,9);
        assertEquals("可以构建矩形",p.getStr());
    }
    @Test
    public void test5(){
        Program p = new Program(5,4);
        assertEquals("可以构建长方形",p.getStr());
    }
}
