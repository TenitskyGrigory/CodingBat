package Warmup1;

public class EveryNth {
    public String everyNth(String str, int n) {
        String c="";
        for(int i = 0; i < str.length(); i = i + n){
            c = c + str.charAt(i);
        }
        return c;
    }
}
