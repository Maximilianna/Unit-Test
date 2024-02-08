package Test4;

import java.util.Objects;

public class Program {
    private String username;
    private String password;
    private String str;
    public Program(String username,String password) {
        this.username = username;
        this.password = password;
        if(username.equals("")&&password.equals("")){
            str="用户量和密码不能为空";
        } else if (username.equals("admin")&&password.equals("123")) {
            str = "登录成功";
        } else if (password.equals("123")) {
            str = "请输入正确的用户名";
        } else if (username.equals("admin")) {
            str = "请输入正确的密码";
        }else {
            str = "请输入正确的用户名和密码";
        }
    }

    public String getStr(){
        return str;
    }

}
