package Warmup_2;

public class StringSplosion {
    public String stringSplosion(String str) {
        String a = "";
        for(int i = 0; i < str.length(); i++){
            a = a + str.substring(0, i+1);}
        return a;
    }
}
