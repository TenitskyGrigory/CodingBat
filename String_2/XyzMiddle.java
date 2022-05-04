package String_2;

public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        if(str.length() < 3) {
            return false;
        }

        int newString1 = str.length() / 2 - 2;
        int newString2 = str.length() / 2 - 1;

        if(str.length() % 2 == 0) {
            return (str.substring(newString1, newString1 + 3).equals("xyz") ||
                    str.substring(newString2, newString2 + 3).equals("xyz"));
        }
        return str.substring(newString2, newString2 + 3).equals("xyz");
    }
}
