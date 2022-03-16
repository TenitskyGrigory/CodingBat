package CodingBat.String_1;

public class ConCat {
    public String conCat(String a, String b) {
        if(a.length() == 0) {
            return b;
        }
        else if (b.length() == 0) {
            return a;
        }
        String c = a.substring(a.length()-1, a.length());
        String d = b.substring(0, 1);
        if(c.equals(d)) {
            String e = b.substring(1, b.length());
            return a + e;
        }
        return a + b;
    }
}
