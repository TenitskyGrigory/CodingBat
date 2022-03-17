package Warmup1;

public class NotString {
    public String notString(String str) {
        String b = new String("not");
        if(str == "not") {return str;}
        if(str.length() <= 3) {return b + " " + str;}
        String a = str.substring(0, 3);
        if(a.equals(b)) {return str;}
        return b + " " + str;
    }
}
