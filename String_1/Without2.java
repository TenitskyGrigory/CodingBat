package CodingBat.String_1;

public class Without2 {
    public String without2(String str) {
        if ((str.length() == 2) || (str.length()==0)) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        String front = str.substring(0,2);
        String end = str.substring(str.length()-2, str.length());
        String middle = str.substring(2, str.length());
        if (front.equals(end)) {
            return middle;
        }
        else {
            return str;
        }
    }
}
