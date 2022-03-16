package CodingBat.String_1;

public class Left2 {
    public String left2(String str) {
        String a = str.substring(0, 2);
        String b = str.substring(2, str.length());
        return b + a;
    }
}
