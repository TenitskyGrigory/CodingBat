package Warmup2;

public class StringX {
    public String stringX(String str) {
        String a = "";
        for(int i = 0; i < str.length(); i++) {
            if(!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                a = a + str.substring(i, i+1);
            }
        }
        return a;
    }
}
