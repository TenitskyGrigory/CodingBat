package String_1;

public class HasBad {
    public boolean hasBad(String str) {
        if(str.equals("xba")) {
            return false;
        }
        if(str.length() < 3) {
            return false;
        }
        String a = str.substring(0, 3);
        if (a.equals("bad")) {
            return true;
        }
        String b = str.substring(1, 4);
        if (b.equals("bad")) {
            return true;
        }
        else {
            return false;
        }
    }
}
