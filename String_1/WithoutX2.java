package CodingBat.String_1;

public class WithoutX2 {
    public String withoutX2(String str) {
        if (str.equals("x")| str.length() == 0) {
            return "";
        }
        String a = str.substring(0,1);
        String b = str.substring(1,2);
        if((a.equals("x")) && (b.equals("x"))) {
            String c = str.substring(2, str.length());
            return c;
        }
        else if(a.equals("x")) {
            String d = str.substring(1, str.length());
            return d;
        }
        else if(b.equals("x")) {
            String e = str.substring(2, str.length());
            return a + e;
        }
        else {
            return str;
        }
    }
}
