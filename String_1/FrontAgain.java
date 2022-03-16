package CodingBat.String_1;

public class FrontAgain {
    public boolean frontAgain(String str) {
        if (str.length()<2) {
            return false;
        }
        String front = str.substring(0,2);
        String end = str.substring(str.length()-2, str.length());
        if(front.equals(end)) {
            return true;
        }
        return false;
    }
}
