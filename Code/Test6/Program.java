package Test6;
//周一 - Monday
//周二 - Tuesday
//周三 - Wednesday
//周四 - Thursday
//周五 - Friday
//周六 - Saturday
//周日 - Sunday

public class Program {
    private String str;
    public Program(char a,char b){
        if(a == 'M'){
            str = "Monday";
        }else if (a == 'T'){
            if(b == 'u'){
                str = "Tuesday";
            }else if (b == 'h'){
                str = "Thursday";
            }
        } else if (a == 'W') {
            str = "Wednesday";
        } else if (a == 'F') {
            str = "Friday";
        } else if (a == 'S') {
            if(b == 'a'){
                str = "Saturday";
            } else if (b == 'u') {
                str = "Sunday";
            }
        }
    }
    public String getStr(){
        return str;
    }
}
