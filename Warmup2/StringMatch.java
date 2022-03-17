package Warmup2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        int leng = Math.min(a.length(), b.length());
        for(int i = 0; i < leng-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if(aSub.equals(bSub)) {
                count++;
            }
        }
        return count;
    }
}
