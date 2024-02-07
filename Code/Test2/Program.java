package Test2;

import java.util.Arrays;
import java.util.HashSet;

public class Program {
    private int days;
    HashSet<Integer> hs = new HashSet<>(Arrays.asList(4,6,9,11));

    public Program(int year, int mouth) {
        if (mouth != 2) {
            if (hs.contains(mouth)) {
                days = 30;
            } else {
                days = 31;
            }
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                days = 29;
            } else {
                days = 28;
            }
        }
        System.out.println(year+"年"+mouth+"月份的天数是："+days+"天");
    }

    public int getDays(){
        return days;
    }
}
