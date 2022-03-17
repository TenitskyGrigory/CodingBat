package String_1;

public class LastTwo {
    public String lastTwo(String str) {
        if(str.length() < 2) {
            return str;
        }
        String a = str.substring(0, str.length()-2);
        String b = str.substring(str.length()-2, str.length()-1);
        String c = str.substring(str.length()-1, str.length());
        if ( str.length() == 2) {
            return c + b;
        }
        else {
            return a + c + b;
        }
    }
}
