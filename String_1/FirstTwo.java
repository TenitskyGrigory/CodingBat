package String_1;

public class FirstTwo {
    public String firstTwo(String str) {
        int a = str.length();
        if(a == 0) {
            String b = "";
            return b;
        }
        else if (a == 1) {
            String c = str.substring(0,1);
            return c;
        }
        else {
            String d = str.substring(0,2);
            return d;
        }
    }
}
