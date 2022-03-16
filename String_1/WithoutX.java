package CodingBat.String_1;

public class WithoutX {
    public String withoutX(String str) {
        if (str.equals("x")| str.length() == 0) {
            return "";
        }
        String front = str.substring(0,1);
        String end = str.substring(str.length()-1, str.length());
        if((front.equals("x")) && (end.equals("x"))) {
            String middle = str.substring(1, str.length()-1);
            return middle;
        }
        else if(front.equals("x")) {
            String a = str.substring(1, str.length());
            return a;
        }
        else if(end.equals("x")) {
            String b = str.substring(0, str.length()-1);
            return b;
        }
        else {
            return str;
        }
    }
}
