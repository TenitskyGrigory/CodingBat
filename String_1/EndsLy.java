package CodingBat.String_1;

public class EndsLy {
    public boolean endsLy(String str) {
        if(str.length()<2) {
            return false;
        }
        String a = str.substring(str.length()-2, str.length());
        if(a.equals("ly")) {
            return true;
        }
        return false;
    }
}
