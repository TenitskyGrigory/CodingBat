package String_2;

public class DoubleChar {
    public String doubleChar(String str) {
        int count = 0;
        char[] arr = new char[2 * str.length()];
        for(int i = 0; i < str.length(); i++) {
            arr[count] = str.charAt(i);
            count++;
            arr[count] = str.charAt(i);
            count++;
        }
        return new String(arr);
    }
}