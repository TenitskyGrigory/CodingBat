package String_1;

public class NTwice {
    public String nTwice(String str, int n) {
        String front = str.substring(0, n);
        String end = str.substring(str.length()-n, str.length());
        return front + end;
    }
}
