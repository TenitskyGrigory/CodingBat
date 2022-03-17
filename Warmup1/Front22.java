package Warmup1;

public class Front22 {
    public String front22(String str) {
        if(str.length() < 3) {
            return str + str + str;
        }
        else {
            String front = str.substring(0, 2);

            return front + str + front;
        }
    }
}
