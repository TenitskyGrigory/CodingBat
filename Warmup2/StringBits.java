package Warmup_2;

public class StringBits {
    public String stringBits(String str) {
        String a = "";
        for(int i = 0; i < str.length(); i += 2){
            char b = str.charAt(i);
            a = a + b;}
        return a;
    }
}
