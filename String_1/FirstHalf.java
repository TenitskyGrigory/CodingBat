package CodingBat.String_1;

public class FirstHalf {
    public String firstHalf(String str) {
        int n = str.length() / 2;
        String front = str.substring(0, n);
        return front;
    }
}
