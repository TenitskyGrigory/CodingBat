package String_2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String newString = str.substring(0, n);
        String newStr = str.substring(n);
        return newStr.contains(newString);
    }
}
