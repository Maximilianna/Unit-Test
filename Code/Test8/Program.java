package Test8;

public class Program {
    private String str;

    public Program(String str) {
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            StringBuffer sb = new StringBuffer();
            sb.append("ef");
            for (int i = 2; i < str.length(); i++) {
                sb.append(str.charAt(i));
            }
            str = sb.toString();
            this.str = "替换前缀后的字符串为：" + str;
        } else if (str.charAt(str.length() - 1) == 'd' && str.charAt(str.length() - 2) == 'c') {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'd') {
                    sb.append("gh");
                    i++;
                    continue;
                }
                sb.append(str.charAt(i));
            }
            str = sb.toString();
            this.str = "替换后缀后的字符串为：" + str;
        } else {
            str = str.toUpperCase();
            this.str = "大写字母的字符串为：" + str;
        }
    }

    public String getStr() {
        return str;
    }
}
