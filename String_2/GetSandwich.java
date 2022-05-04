package String_2;

public class GetSandwich {
    public String getSandwich(String str) {
        int front = -1;
        int end = -1;

        for(int i = 0; i < str.length() - 5; i++) {
            if(str.substring(i, i + 5).equals("bread")) {
                front = i;
                break;
            }
        }

        for(int k = str.length() - 5; k >= 0; k--) {
            if(str.substring(k, k + 5).equals("bread")) {
                end = k;
                break;
            }
        }

        if(front != -1 && end != -1 && front != end) {
            return str.substring(front + 5, end);
        }
        return "";
    }
}
