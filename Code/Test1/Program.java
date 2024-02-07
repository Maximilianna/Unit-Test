package Test1;

public class Program {
    private int x;

    public Program(int a, int b) {
        if (a > 9 && b > 5) {
            x = a * a * b;
            System.out.println("x=a*a*b的值：" + x);
        } else if (a < 0 && b < 0) {
            x = a - b;
            System.out.println("x=a-b的值：" + x);
        } else {
            x = a + b;
            System.out.println("x=a+b的值：" + x);
        }
    }

    public int getX() {
        return x;
    }
}
