package CodingBat.String_1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String a = str.substring(str.length()-2, str.length());
        return a + a + a;
    }
}
