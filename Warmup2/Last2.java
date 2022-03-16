package Warmup_2;

public class Last2 {
    public int last2(String str) {
        if (str.length() < 2) return 0;
        String a = str.substring(str.length()-2);
        int count = 0;
        for(int i = 0; i < str.length()-2; i++) {
            String b = str.substring(i, i + 2);
            if(b.equals(a)) {
                count++;
            }
        }
        return count;
    }
}
