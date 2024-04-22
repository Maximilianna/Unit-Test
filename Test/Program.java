import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.lang.Math;


public class Program {
	private String str = null;
	
	public void test1(int a, int b) {
		int x = 0;
		if(a > 9 && b > 5) {
			x = a * a * b;
			str = "x=a*a*b的值：" + x;
		}else if(a < 0 && b < 0) {
			x = a - b;
			str = "x=a-b的值：" + x;
		}else {
			x = a + b;
			str = "x=a+b的值：" + x;
		}
	}
	
	public void test2(int year, int month) {
		Set<Integer> s = new HashSet<Integer>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
		if(month > 12 || month < 1) {
			str = "月份输入不正确";
		}else if(month != 2) {
			if(s.contains(month)) {
				str = "31天";
			}else {
				str = "30天";
			}
		}else {
			if(year % 4 == 0 && year % 100 != 0) {
				str = year + "年" + month + "月份的天数是29天";
			}else if(year % 400 == 0) {
				str = year + "年" + month + "月份的天数是29天";
			}else {
				str = year + "年" + month + "月份的天数是28天";
			}
		}
	}
	
	public void test3(String Email, String password) {
		String regex1 = "[a-zA-Z]{5}@1(26|63).com(.cn)?";
		String regex2 = "\\d{6,}";
		if(Email.matches(regex1) && password.matches(regex2)) {
			str = "信息正确";
		}else if(Email.matches(regex1)) {
			str = "密码不符合要求";
		}else {
			str = "邮箱地址不符合要求";
		}
	}
	
	public void test4(String username, String password) {
		if(username.equals("") && password.equals("")) {
			str = "用户名或密码不能为空";
		}else if(username.equals("admin") && password.equals("123")) {
			str = "登录成功";
		}else if(!username.equals("admin") && password.equals("123")) {
			str = "请输入正确的用户名";
		}else if(username.equals("admin") && !password.equals("123")) {
			str = "请输入正确的密码";
		}else {
			str = "请输入正确的用户名和密码";
		}
	}
	
	public void test5(int x, int y) {
		if(x <= 0 || y <= 0) {
			str = "输入不符合要求";
		}else if(x == y) {
			str = "可以构建圆形或正方形";
		}else if(Math.abs(x - y) > 2 && Math.abs(x - y) <= 5) {
			str = "可以构建椭圆";
		}else if(Math.abs(x - y) > 5) {
			str = "可以构建矩形";
		}else {
			str = "可以构建长方形";
		}
	}
	
	public void test6(char u,char l) {
		//Monday		周一
		//Tuesday		周二
		//Wednesday		周三
		//Thursday		周四
		//Friday		周五
		//Saturday		周六
		//Sunday		周日
		if(u == 'M') {
			str = "Monday";
		}else if(u == 'T' && l == 'u') {
			str = "Tuesday";
		}else if(u == 'W') {
			str = "Wednesday";
		}else if(u == 'T' && l == 'h') {
			str = "Thursday";
		}else if(u == 'F') {
			str = "Friday";
		}else if(u == 'S' && l == 'a') {
			str = "Saturday";
		}else if(u == 'S' && l == 'u') {
			str = "Sunday";
		}
	}
	
	public void test7(String username, String password) {
		if(username.matches("[a-zA-Z]{8}") && password.matches("\\d{6,}")) {
			str = "注册成功";
		}else if(username.matches("[a-zA-Z]{8}")) {
			str = "密码不符合要求";
		}else {
			str = "用户名不符合要求";
		}
	}
	
	public void test8(String str) {
		StringBuilder sb = new StringBuilder();
		int len = str.length();
		if(str.charAt(0) == 'a' && str.charAt(1) == 'b') {
			sb.append("ef");
			for(int i = 2;i<len;i++) {
				sb.append(str.charAt(i));
			}
			str = sb.toString();
			this.str = "替换前缀后的字符串为："+str;
		}else if(str.charAt(len - 2) == 'c' && str.charAt(len - 1) == 'd') {
			for(int i = 0;i<len;i++) {
				if(str.charAt(i) == 'c' && str.charAt(i + 1) == 'd') {
					sb.append("gh");
					i++;
				}else {
					sb.append(str.charAt(i));
				}
			}
			str = sb.toString();
			this.str = "替换cd后的字符串为："+str;
		}else {
			this.str = "大写字母的字符串为："+str.toUpperCase();
		}
	}
	
	public void test9(int x) {
		float y = 0;
		if(x <= 10) {
			y = (float) (x * 0.1);
		}else if(x <= 20) {
			y = (float) (x * 0.075);
		}else if(x <= 40) {
			y = (float) (x * 0.05);
		}else if(x <= 60) {
			y = (float) (x * 0.03);
		}else if(x <= 100) {
			y = (float) (x * 0.015);
		}else {
			y = (float) (x * 0.01);
		}
		str = "总提成："+y+"万";
	}
	
	public void test10(int x, int y) {
		int a = 0;
		if(x >= 80 && y >= 60) {
			if(x >= 90 || y >= 90) {
				
			}else {
				a = 2;
				str = "a=x:"+a;
			}
		}else if(x <= 70 || y <= 70) {
			a = 3;
			str = "a=x:"+a;
		}else {
			a = 4;
			str = "a=x:"+a;
		}
	}
	
	public void test11(String name, String PhoneNumber, String add) {
		if (PhoneNumber.matches("\\d{11}") && add.matches("[a-zA-Z][a-zA-Z0-9]{0,9}")) {
			str = "OK";
		}else if(PhoneNumber.matches("\\d{11}")) {
			str = "地址不符合要求";
		}else {
			str = "手机号不符合要求";
		}
	}
	
	public void test12(int x, int y) {
		float j;
		if(x>60&&y<35) {
			j = 10 * x - y;
			str = "j1=："+j;
		}else if(x==25 && y>50) {
			j = (float) (y * Math.log(x+10));
			str = "j3=："+j;
		}else {
			j = (float) ((x-y)*(Math.pow(10, 5)%7));
			str = "j2=："+j;
		}
	}
	
	public void test13(float a, float b, float c) {
		if(!((a >= 1 && a <= 10) && (b >= 1 && b <= 10) && (c >= 1 && c <= 10))) {
			str = "输入边值不在范围内";
		}else if(!((a + b) > c && (c + b) > a && (c + a) > b)) {
			str = "输入边值不能组成三角形";
		}else if(a == b && b == c) {
			str = "能组成等边三角形";
		}else if(a == b || b == c || a == c) {
			str = "能组成等腰三角形";
		}else {
			str = "能组成普通三角形";
		}
	}
	
	public int test14(int iRecordNum, int IType) {
		int x = 0;
		int y = 0;
		while(true) {
			if(iRecordNum-- > 0) {
				if(IType == 0) {
					x = y + 2;
					break;
				}else if(IType == 1) {
					x = y + 10;
				}else {
					x = y + 20;
				}
			}else {
				break;
			}
		}
		return x;
	}
	
	public String getStr() {
		String str = this.str;
		this.str = null;
		return str;
	}
}
