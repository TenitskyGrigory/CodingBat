package Warmup1;

public class StartHi {
    public boolean startHi(String str) {
        if(str.length() < 2) { return false; }
        String a = str.substring(0,2);
        if (a.equals("hi")) {return true;}
        return false;
    }
}
