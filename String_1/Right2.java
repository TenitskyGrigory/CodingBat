package String_1;

public class Right2 {
    public String right2(String str) {
        String a = str.substring(0, str.length()-2);
        String b = str.substring(str.length()-2, str.length());
        return b + a;
    }
}
