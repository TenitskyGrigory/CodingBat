package Warmup_2;

public class DoubleX {
    boolean doubleX(String str) {
        if(str.length() < 2)  {return false;}
        int a = str.indexOf("x");
        if(a+1 >= str.length()) {return false;}
        char c = str.charAt(a+1);
        if(c == 'x') {return true;
        }
        return false;
    }
}
