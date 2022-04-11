package String_2;

public class EndOther {
    public boolean endOther(String a, String b) {
        if(a.length() < b.length()) {
            String c = a;
            a = b;
            b = c;
        }

        return a.substring(a.length() - b.length()).equalsIgnoreCase(b);
    }
}
