package CodingBat.Warmup1;

public class DelDel {
    public String delDel(String str) {
        if(str.length() <=3) {return str;}
        int a = str.length()-1;
        String front = str.substring(0, 1);
        String back = str.substring(4,a+1);
        String b = str.substring(1,4);
        if(b.equals("del")) {return front+back;}
        return str;
    }
}
