package CodingBat.Warmup1;

public class BackAround {
    public String backAround(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        else {
            String back = str.substring(str.length()-1, str.length());
            return back + str + back;
        }
    }
}
