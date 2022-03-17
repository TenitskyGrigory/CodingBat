package Warmup1;

public class Front3 {
    public String front3(String str) {
        if (str.length() <= 3) {
            return str + str + str;
        }
        else {
            String front = str.substring(0, 3);

            return front + front + front;}
    }
}
