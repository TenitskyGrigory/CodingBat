package CodingBat.String_1;

public class TwoChar {
    public String twoChar(String str, int index) {
        if (index < 0) {
            String front = str.substring(0,2);
            return front;
        }
        int n = str.length();
        if((n - index) > 1) {
            String end = str.substring(index, index+2);
            return end;
        }
        String front = str.substring(0,2);
        return front;
    }
}
