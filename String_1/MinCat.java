package String_1;

public class MinCat {
    public String minCat(String a, String b) {
        int i = a.length();
        int j = b.length();
        if (i < j) {
            String c = b.substring(b.length() - i, b.length());
            return a + c;
        }
        else if (i > j) {
            String d = a.substring(a.length() - j, a.length());
            return d + b;
        }
        else {
            return a + b;
        }
    }
}
