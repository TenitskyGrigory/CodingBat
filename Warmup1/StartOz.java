package Warmup1;

public class StartOz {
    public String startOz(String str) {
        if (str.length() < 3) {return str;}
        String a = str.substring(0,1);
        String b = str.substring(1,2);
        if((a.equals("o")) & (b.equals("z"))) {return a+b;}
        if(a.equals("o")){return a;}
        if(b.equals("z")) {return b;}
        return "";
    }
}
