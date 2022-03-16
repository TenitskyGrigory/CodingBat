package CodingBat.String_1;

public class MiddleThree {
    public String middleThree(String str) {
        int n = (str.length()-1) / 2;
        String middle = str.substring(n-1, n + 2);
        return middle;
    }
}
