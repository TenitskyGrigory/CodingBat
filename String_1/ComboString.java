package String_1;

public class ComboString {
    public String comboString(String a, String b) {
        int c = a.length();
        int d = b.length();
        if(c > d) {
            return b + a + b;
        }
        return a + b + a;
    }
}
