package CodingBat.String_1;

public class AtFirst {
    public String atFirst(String str) {
        if (str.length() == 1) {
            return str + "@";
        }
        else if (str.length() == 0) {
            return "@" + "@";
        }
        String front = str.substring(0,2);
        return front;
    }
}
