package CodingBat.Warmup1;

public class MixStart {
    public boolean mixStart(String str) {
        if(str.length() < 3) {return false;}
        String a = str.substring(1,3);
        if(a.equals("ix")) {return true;}
        return false;
    }
}
