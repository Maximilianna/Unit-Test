package Test5;

public class Program {
    private int x;
    private int y;
    private String str;
    public Program(int x,int y){
        this.x = x;
        this.y = y;
        if(x <= 0 || y <= 0){
            str = "输入不符合要求";
        } else if (x == y) {
            str = "可以构建圆形或正方形";
        } else if (Math.abs(x - y) > 2 && Math.abs(x - y) <= 5) {
            str = "可以构建椭圆";
        } else if (Math.abs(x - y) > 5) {
            str = "可以构建矩形";
        } else if (Math.abs(x - y) > 0 && Math.abs(x - y) <= 2) {
            str = "可以构建长方形";
        }
    }

    public String getStr(){
        return str;
    }
}
