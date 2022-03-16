package CodingBat.Warmup1;

public class EndUp {
    public String endUp(String str) {
        if(str.length() <= 3) {return str.toUpperCase();}
        int a = str.length();
        String b = str.substring(a-3, a);
        String c = str.substring(0, a-3);
        b = b.toUpperCase();
        return c+b;
    }
}
