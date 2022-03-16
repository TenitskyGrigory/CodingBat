package CodingBat.Warmup2;

public class AltPairs {
    public String altPairs(String str) {
        String a = "";
        for(int i = 0; i < str.length(); i += 4) {
            int b = i + 2;
            if(b > str.length()){
                b = str.length();
            }
            a = a + str.substring(i, b);
        }
        return a;
    }
}
