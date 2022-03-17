package String_1;

public class DeFront {
    public String deFront(String str) {
        String a = str.substring(0, 1);
        String b = str.substring(1, 2);
        if ((a.equals("a")) && (b.equals("b"))) {
            return str;
        }
        String c = str.substring(2, str.length());
        if (a.equals("a")) {
            return "a" + c;
        } else if (b.equals("b")) {
            return "b" + c;
        }
        return c;
    }
}