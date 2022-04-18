package String_2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String a = str.substring(str.length()-n);
        String b = "";
        for(int i = 0; i < n; i++) {
            b = b + a;
        }
        return b;
    }
}
