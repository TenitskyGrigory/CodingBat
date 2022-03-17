package Warmup2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String b = "";
        String c = "";
        if (str.length()<3){
            for(int i = 0; i < n; i++){
                b = b + str;}
            return b;}
        String a = str.substring(0, 3);
        for(int i = 0; i < n; i++){
            c = c + a;}
        return c;
    }
}
