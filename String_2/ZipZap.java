package String_2;

public class ZipZap {
    public String zipZap(String str) {
        String newString = "";
        if(str.length() < 3) {
            return str;
        }
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
                newString = newString + "zp";
                i += 2;
            }
            else {
                newString = newString + str.charAt(i);
            }
        }
        return newString;
    }
}
