package Test6;
//周一 - Monday
//周二 - Tuesday
//周三 - Wednesday
//周四 - Thursday
//周五 - Friday
//周六 - Saturday
//周日 - Sunday

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1(){
        Program p = new Program('M','o');
        assertEquals("Monday",p.getStr());
    }
    @Test
    public void test2(){
        Program p = new Program('T','u');
        assertEquals("Tuesday",p.getStr());
    }
    @Test
    public void test3(){
        Program p = new Program('W','e');
        assertEquals("Wednesday",p.getStr());
    }
    @Test
    public void test4(){
        Program p = new Program('T','h');
        assertEquals("Thursday",p.getStr());
    }
    @Test
    public void test5(){
        Program p = new Program('F','r');
        assertEquals("Friday",p.getStr());
    }
    @Test
    public void test6(){
        Program p = new Program('S','a');
        assertEquals("Saturday",p.getStr());
    }
    @Test
    public void test7(){
        Program p = new Program('S','u');
        assertEquals("Sunday",p.getStr());
    }
}
