package CodingBat.String_1;

public class ExtraFront {
    public String extraFront(String str) {
        if(str.length() == 0) {
            return "";
        }
        else if (str.length() == 1) {
            return str + str + str;
        }
        else {
            String front = str.substring(0,2);
            return front + front + front;
        }
    }
}
