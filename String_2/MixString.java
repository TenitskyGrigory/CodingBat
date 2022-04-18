package String_2;

public class MixString {
    public String mixString(String a, String b) {
        int count = 0;
        char[] arr;
        String end;

        if(a.length() > b.length()) {
            arr = new char[2 * b.length()];
            end = a.substring(b.length());
        }
        else {
            arr = new char[2 * a.length()];
            end = b.substring(a.length());
        }

        for(int i = 0; i < arr.length/2; i++) {
            arr[count] = a.charAt(i);
            count++;
            arr[count] = b.charAt(i);
            count++;
        }
        return new String(arr) + end;
    }
}
