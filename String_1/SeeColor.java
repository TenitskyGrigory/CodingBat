package CodingBat.String_1;

public class SeeColor {
    public String seeColor(String str) {
        if(str.equals("red")) {
            return str;
        }
        if(str.length() <= 3) {
            return "";
        }
        String a = str.substring(0,3);
        String b = str.substring(0,4);
        if(a.equals("red")) {
            return "red";
        }
        else if (b.equals("blue")) {
            return "blue";
        }
        return "";
    }
}
