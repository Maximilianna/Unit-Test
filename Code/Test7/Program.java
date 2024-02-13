package Test7;

public class Program {
    private String str;

    public Program(String username, String password) {
        if (username.length() == 8) {
            for (int i = 0; i < username.length(); i++) {
                if (!(username.charAt(i) >= 65 && username.charAt(i) <= 90
                        || username.charAt(i) >= 97 && username.charAt(i) <= 122)) {
                    str = "用户名不符合要求";
                    return;
                }
            }
        } else {
            str = "用户名不符合要求";
            return;
        }
        if (password.length() >= 6) {
            for (int i = 0; i < password.length(); i++) {
                if (!(password.charAt(i) >= 48 && password.charAt(i) <= 57)) {
                    str = "密码不符合要求";
                    return;
                }
            }
        } else {
            str = "密码不符合要求";
            return;
        }
        str = "注册成功";
        return;
    }
    public String getStr(){
        return str;
    }
}
