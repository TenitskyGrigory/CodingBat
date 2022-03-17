package Warmup1;

public class FrontBack {
    public String frontBack(String str) {
        if (str.length() < 2){
            return str;
        }
        else {
            String front = str.substring(0, 1);
            String back = str.substring(str.length()-1, str.length());
            String middle = str.substring(1, str.length()-1);
            return back + middle + front;}
    }
}
