package Test3;

import java.util.*;

public class Program {
    private String Login_Name = "";
    private String Host_Name = "";
    private String Domain_Name = "";
    private String Str;
    HashSet<String> hs1 = new HashSet<>(Arrays.asList("163","126"));
    HashSet<String> hs2 = new HashSet<>(Arrays.asList("com","com.cn"));

    public Program(String str,String Password) {
        int i = 0;
        for (; str.charAt(i) != '@'; i++) Login_Name = Login_Name + str.charAt(i);
        i++;
        for (; str.charAt(i) != '.'; i++) Host_Name = Host_Name + str.charAt(i);
        i++;
        for (; i < str.length(); i++) Domain_Name = Domain_Name + str.charAt(i);
        if (Login_Name.length() == 5&&hs1.contains(Host_Name)&&hs2.contains(Domain_Name))
            if(Password.length()>=6) Str = "信息正确";
            else Str = "密码不符合要求";
        else Str = "邮箱地址不符合要求";
    }

    public String getStr(){
        return Str;
    }
}
