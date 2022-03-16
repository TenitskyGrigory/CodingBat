package CodingBat.String_1;

public class LastChars {
    public String lastChars(String a, String b) {
        int i = a.length();
        int j = b.length();
        if( i == 0 && j == 0) {
            return "@" + "@";
        }
        else if(i == 0) {
            String c = b.substring(b.length()-1, b.length());
            return "@" + c;
        }
        else if(j == 0) {
            String d = a.substring(0, 1);
            return d + "@";
        }
        else {
            String c = b.substring(b.length()-1, b.length());
            String d = a.substring(0, 1);
            return d + c;
        }
    }
}
