package String_1;

public class TheEnd {
    public String theEnd(String str, boolean front) {
        if(front == true) {
            String a = str.substring(0, 1);
            return a;
        }
        String b = str.substring(str.length()-1, str.length());
        return b;
    }
}
